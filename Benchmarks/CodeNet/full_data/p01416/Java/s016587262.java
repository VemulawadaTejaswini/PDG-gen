import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

class Main{
    
    private static final int[] dx = {0,1,0,-1};
    private static final int[] dy = {1,0,-1,0};
    
    static class Pox
    {
	public int x,y;
	public char extraterrestrial;
	
	Pox()
	{
	    x = y = -1;
	    extraterrestrial = 'a';
	}
	
	Pox(char c,int a,int b)
	{
	    x = a;
	    y = b;
	    extraterrestrial = c;
	}

    }
    
    
    
    static class PP
    {
	Point p1,p2;
	
	PP()
	{
	    p1 = new Point(-1,-1);
	    p2 = new Point(-1,-1);
	}
	
	PP(Point a,Point b)
	{
	    p1 = a;
	    p2 = b;
	}
	
    }
    
    
    public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int M,N;

	String line;
	while((line = in.readLine()) != null)
	    {
		
		
		M = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		N = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
		
		LinkedList<Pox> list = new LinkedList<Pox>();//アルファベットの座標
		LinkedList<Pox> M_list = new LinkedList<Pox>();//中継地点
		HashMap<Character,PP> map = new HashMap<Character,PP>();
		char[][] cmap = new char[M][N];
		
		
		for(int i=0;i<M;i++)
		    {
			line = in.readLine();
			for(int j=0;j<N;j++)
			    {
				
				cmap[i][j] = line.charAt(j);		
				
				if(line.charAt(j) != '.')
				    {
					list.add(new Pox(line.charAt(j),j,i));
					if(!map.containsKey(line.charAt(j)))
					    {
						map.put(line.charAt(j),new PP(new Point(j,i),new Point(-1,-1)));
					    }
					else
					    {
						int x,y,xx,yy;
						x = j;
						y = i;
						xx = map.get(line.charAt(j)).p1.x;
						yy = map.get(line.charAt(j)).p1.y;
						map.put(line.charAt(j),new PP(new Point(xx,yy),new Point(j,i)));
						
						if(!(x == xx || y == yy))
						    {
							M_list.add(new Pox(line.charAt(j),x,yy));
							M_list.add(new Pox(line.charAt(j),xx,y));
						    }
					    }
				    } 
			    }
		    }
		

		boolean[] used = new boolean[28];	
		for(int i=0;i<28;i++)
		    {
			used[i] = false;
		    }
		
		boolean finish = false;
		int cnt = 0;
		while(!finish)
		    {
			finish = true;
			
			for(int i=0;i<list.size();i++)
			    {
				if(used[list.get(i).extraterrestrial - 'A'])
				    continue;
				
				int x,y,xx,yy;
				char c = list.get(i).extraterrestrial;
				x = map.get(c).p1.x;
				y = map.get(c).p1.y;
				xx = map.get(c).p2.x;
				yy = map.get(c).p2.y;
				
				int hx,hxx;
				int hy,hyy;
				
				hx = Math.min(x,xx);
				hxx = Math.max(x,xx);
				
				hy = Math.min(y,yy);
				hyy = Math.max(y,yy);
				
				if(!(x == xx || y == yy))
				    continue;
				
				boolean ok = true;
				for(int j=0;j<list.size();j++)
				    {
					if(list.get(j).extraterrestrial == c)
					    continue;
					
					if(used[list.get(j).extraterrestrial-'A'])
					    continue;
					
					int list_x,list_y;
					list_x = list.get(j).x;
					list_y = list.get(j).y;
					
					if(x == xx)
					    {
						if(x == list_x)
						    {
							if(hy < list_y && list_y < hyy)
							    {
								ok = false;
								break;
							    }
							else
							    {
								continue;
							    }
						    }
						else
						    {
							continue;
						    }
					    }
					else if(y == yy)
					    {
						if(y == list_y)
						    {
							if(hx < list_x && list_x < hxx)
							    {
								ok = false;
								break;
							    }
							else
							    {
								continue;
							    }
						    }
						else
						    {
							continue;
						    }

					    }
				

				    }

				if(ok)
				    {

					int xp,yp;
					xp = list.get(i).x;
					yp = list.get(i).y;

					boolean NoWay = false;				

					for(int j=0;j<4;j++)
					    {
						int nx = xp + dx[j],ny = yp + dy[j];
						if(!(0<= nx && nx <N && 0<= ny && ny <M ))
						    continue;

						if(cmap[ny][nx] == list.get(i).extraterrestrial)
						    {
							NoWay = true;
							break;
						    }
					    }

					if(NoWay)
					    continue;

					cnt += 2;
					used[list.get(i).extraterrestrial-'A'] = true;
					finish = false;
				    }

			    }



			for(int i=0; i<M_list.size();i++)
			    {
				if(used[M_list.get(i).extraterrestrial-'A'])
				    continue;

				int mx,my,x1,y1,x2,y2;

				mx = M_list.get(i).x;
				my = M_list.get(i).y;

				if(cmap[my][mx] != '.')
				    {
					if(!used[cmap[my][mx]-'A'])
					    {
						continue;
					    }
				    }

		
				Point pp = map.get(M_list.get(i).extraterrestrial).p1;
				Point ppp = map.get(M_list.get(i).extraterrestrial).p2;

				x1 = pp.x;
				y1 = pp.y;

				x2 = ppp.x;
				y2 = ppp.y;


				if(x2 == -1 && y2 == -1)
				    continue;


				int hx,hy,hxx,hyy;

				hx = Math.min(mx,x1);
				hxx = Math.max(mx,x1);
				hy = Math.min(my,y1);			
				hyy = Math.max(my,y1);


		
		      

				boolean ok = true;
				for(int j=0;j<list.size();j++)
				    {				    
		       
					if(used[list.get(j).extraterrestrial-'A'])
					    {
						continue;
					    }

					if(list.get(j).extraterrestrial == M_list.get(i).extraterrestrial)
					    {
						continue;
					    }

					int lx,ly;
					lx = list.get(j).x;
					ly = list.get(j).y;

		
					if(mx == x1)
					    {
						if(mx != lx)
						    continue;

						if(hy < ly && ly < hyy)
						    {
							if(!used[cmap[ly][lx]-'A'])
							    {
								ok = false;
								break;
							    }
						    }
						else
						    {
							continue;
						    }
					    }
					else if(my == y1)
					    {
					
						if(my != ly)
						    continue;
						if(hx < lx && lx < hxx)
						    {
							if(!used[cmap[ly][lx]-'A'])
							    {    
								ok = false;
								break;
							    }
						    }
						else
						    {
							continue;
						    }
					    }

				    }

				if(!ok)
				    {
					continue;
				    }

		
				boolean ok2 = true;
				hx = Math.min(mx,x2);
				hxx = Math.max(mx,x2);
				hy = Math.min(my,y2);
				hyy = Math.max(my,y2);

				for(int j=0;j<list.size();j++)
				    {
					if(used[list.get(j).extraterrestrial-'A'])
					    continue;

					if(list.get(j).extraterrestrial == M_list.get(i).extraterrestrial)
					    continue;

					int lx,ly;
					lx = list.get(j).x;
					ly = list.get(j).y;

		       
					if(mx == x2)
					    {

						if(mx != lx)
						    {
							continue;
						    }
					
						if(hy < ly && ly < hyy)
						    {
							if(!used[cmap[ly][lx]-'A'])
							    {
								ok2 = false;
								break;
							    }
							else
							    continue;
						    }
						else
						    {
							continue;
						    }
					    }
					else if(my == y2)
					    {
						if(my != ly)
						    {
							continue;
						    }

						if(hx < lx && lx < hxx)
						    {
							if(!used[cmap[ly][lx]-'A'])
							    {
								ok2 = false;
								break;
							    }
							else 
							    continue;
						    }
						else
						    {
							continue;
						    }
					    }

				    }

				if(ok && ok2)
				    {
					cnt+=2;
					finish = false;
					used[M_list.get(i).extraterrestrial-'A'] = true;
				    }


			    }


		    }

		System.out.println(cnt);
	
	    }
    }

}