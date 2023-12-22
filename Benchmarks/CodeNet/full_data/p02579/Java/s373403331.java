import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable 
{
    static class InputReader 
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) 
        {
            this.stream = stream;
        }
        
        public int read()
        {
            if (numChars==-1) 
                throw new InputMismatchException();
            
            if (curChar >= numChars) 
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                
                if(numChars <= 0)               
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() 
        {
            int c = read();
            
            while(isSpaceChar(c)) 
                c = read();
            
            int sgn = 1;
        
            if (c == '-') 
            {
                sgn = -1;
                c = read();
            }
            
            int res = 0;
            do
            {
                if(c<'0'||c>'9') 
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c)); 
        
            return res * sgn;
        }
		
        public long nextLong() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;
            
            do 
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
		
        public double nextDouble() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') 
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
    
        public String readString() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do 
            {
                res.appendCodePoint(c);
                c = read();
            } 
            while (!isSpaceChar(c));
            
            return res.toString();
        }
     
        public boolean isSpaceChar(int c) 
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public String next()
        {
            return readString();
        }
        
        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
		
    }
	
	static int dirx[]={1,-1,0,0};
	static int diry[]={0,0,1,-1};
	
	
    public static void main(String args[]) throws Exception 
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
	// **just change the name of class from Main to reuquired**
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		
		int n=sc.nextInt(),m=sc.nextInt();
		int sx=sc.nextInt()-1,sy=sc.nextInt()-1;
		int dx=sc.nextInt()-1,dy=sc.nextInt()-1;
		
		char grid[][]=new char[n][m];
		for(int i=0;i<n;++i)
		{
			grid[i]=sc.next().toCharArray();
		}
		
		//System.out.println("c1");
		
		Pair pair[][]=new Pair[n][m];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				pair[i][j]=new Pair(i,j,0,false);
			}
		}
		
		//System.out.println("c2");
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(sx,sy,0,true));
		pair[sx][sy].magic=0;
		pair[sx][sy].visited=true;
		
		//System.out.println("c3");
		
		while(!pq.isEmpty())
		{
			Pair p=pq.poll();
			//System.out.println(p);
			int x=p.x;
			int y=p.y;
			if(x==dx && y==dy) break;
			
		
			for(int i=0;i<4;++i)
			{
				int xx=x+dirx[i];
				int yy=y+diry[i];
				
				if(xx>=0 && xx<n && yy>=0 && yy<m && grid[xx][yy]=='.')
				{
					if(pair[xx][yy].visited)
					{
						if(pair[xx][yy].magic>pair[x][y].magic)
						{
							pq.add(new Pair(xx,yy,pair[x][y].magic,true));
							pair[xx][yy].magic=pair[x][y].magic;
							pair[xx][yy].visited=true;
						}
					}
					else 
					{
						pq.add(new Pair(xx,yy,pair[x][y].magic,true));
						pair[xx][yy].visited=true;
						pair[xx][yy].magic=pair[x][y].magic;
					}
				}
			}
			
			for(int i=x-2;i<=x+2;++i)
			{
				for(int j=y-2;j<=y+2;++j)
				{
					int xx=i,yy=j;
					if(xx>=0 && xx<n && yy>=0 && yy<m && grid[xx][yy]=='.')
					{
						if(pair[xx][yy].visited)
						{
							if(pair[xx][yy].magic>pair[x][y].magic+1)
							{
								pair[xx][yy].visited=true;
								pair[xx][yy].magic=pair[x][y].magic+1;
								pq.add(new Pair(xx,yy,pair[x][y].magic+1,true));
							}
						}
						else
						{
							pair[xx][yy].magic=pair[x][y].magic+1;
							pair[xx][yy].visited=true;
							pq.add(new Pair(xx,yy,pair[x][y].magic+1,true));
						}
					}
				}
			}
			
			//System.out.println(pq);
		}
		
		
		if(!pair[dx][dy].visited) w.println("-1");
		else w.println(pair[dx][dy].magic);
		
        System.out.flush();
        w.close();
    }
}

class Pair implements Comparable<Pair>
{
	int x,y,magic;
	boolean visited;
	Pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Pair(int x,int y,int magic,boolean visited)
	{
		this.x=x;
		this.y=y;
		this.magic=magic;
		this.visited=visited;
	}
	
	public String toString()
	{
		String s="("+x+","+y+","+magic+")";
		return s;
	}
	
	public int compareTo(Pair p)
	{
		return this.magic-p.magic;
	}
}