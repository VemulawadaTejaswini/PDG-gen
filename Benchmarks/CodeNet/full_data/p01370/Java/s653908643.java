import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

class Main
{

    private static final int[] dx = {0,1,1,0,-1,-1};
    private static final int[] dy = {1,1,0,-1,-1,0};

    private static class Pox implements Comparable<Pox>
    {
	public Point p;
	public int cnt;

	Pox()
	{
	    p = new Point(-1,-1);
	    cnt = 0;
	}

	Pox(int x,int y,int c)
	{
	    p = new Point(x,y);
	    cnt = c;
	}


	public int compareTo(Pox a)
	{
	    return -1;
	}


    }

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		String line;
		line = in.readLine();
		int t,n;		t = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		n = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		if(t == 0 && n == 0)
		    break;
		HashMap<Point,Boolean> map = new HashMap<Point,Boolean>();

		for(int i=0;i<n;i++)
		    {
			int X,Y;
			line = in.readLine();
			X = Integer.parseInt(line.substring(0,line.indexOf(" ")));
			Y = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(new Point(X,Y),true);
		    }

		int sx,sy;
		line = in.readLine();
		sx = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		sy = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		Queue<Pox> que = new PriorityQueue<Pox>();
		que.offer(new Pox(sx,sy,0));
		map.put(new Point(sx,sy),false);

		int[][] used = new int[400][400];

		for(int i=0;i<200;i++)
		    for(int j=0;j<200;j++)
			used[i][j] = 10000000;

		while(que.size() > 0)
		    {
			Pox pox = que.poll();

			if(pox.cnt >= t)
			    {
				continue;
			    }

			for(int i=0;i<6;i++)
			    {
				int nx = pox.p.x + dx[i],ny = pox.p.y + dy[i];
				if(!(Math.abs(nx) <= 30 && Math.abs(ny) <= 30))
				    continue;

				if(map.containsKey(new Point(nx,ny)))
				    {
					if(map.get(new Point(nx,ny)))
					    continue;
				    }

				if(used[ny+100][nx+100] <= pox.cnt)
				    continue;

				used[ny+100][nx+100] = pox.cnt;
				map.put(new Point(nx,ny),false);
				que.offer(new Pox(nx,ny,pox.cnt+1));
			    }

		    }
		System.out.println(map.size()-n);
	    }
    }

}