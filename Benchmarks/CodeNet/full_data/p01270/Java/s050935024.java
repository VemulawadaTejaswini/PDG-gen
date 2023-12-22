import java.util.*;

public class AOJ2152
{

  

    public static void main(String args[])
    {
	Scanner in = new Scanner(System.in);
	int N;
	boolean aaa = true;
	while(true)
	    {

		N = in.nextInt();
		if(N == 0)break;

		if(!aaa)System.out.println();
		aaa = false;
		LinkedList<P> list = new LinkedList<P>();
		list.add(new P(0,0,-1));

		String c;
		int I,S;
		for(int i=0;i<N;i++)
		    {
			c = in.next();
			if(c.equals("W"))
			    {
				I = in.nextInt();
				S = in.nextInt();
				for(int j=0;j<list.size()-1;j++)
				    {	
					int v1 = list.get(j).r;
					int v2 = list.get(j+1).l;
					if(v1 == v2)continue;
					//System.out.println("add ! " + j + " " + v1 + " " + v2);
					list.add(j+1,new P(v1,Math.min((v2-v1)+v1,v1+S),I) ); 
					S -= (v2-v1);
					if(S < 0)S = 0;

					if(S == 0)break;
				    }
				if(S != 0)
				    {

						int lass = (list.size()-1 >= 0?list.get(list.size()-1).r:0);
						list.add(new P(lass,lass+S,I));

				    }
					
			    }
			else if(c.equals("D"))
			    {
				I = in.nextInt();
				for(int j=1;j<list.size();j++)
				    {
					int v = list.get(j).id;
					if(v == I)
					    {
						P p = list.remove(j);
					    }
				    }
			    }
			else
			    {
				I = in.nextInt();
				boolean found = false;
				for(int j=1;j<list.size();j++)
				    {
					P p = list.get(j);
					if(p.l <= I && I < p.r)
					    {
						found = true;
						System.out.println(p.id);
						break;
					    }
				    }
				if(!found)System.out.println(-1);
			    }
			/*
			System.out.println("------------");
			for(int j=0;j<list.size();j++)
			    {
				System.out.println(list.get(j).l + " - " +list.get(j).r + " : " + list.get(j).id);
			    }
			System.out.println("------------");
			*/
		    }

	    }
    }
}

class P
{
    public int r,l,id;
    P(int rl,int rr,int rid)
    {
	r = rr;
	l = rl;
	id = rid;
    }
}