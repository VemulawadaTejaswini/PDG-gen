import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	
    public static void main(String args[]) throws Exception
    {
		int sx=sc.nextInt(),sy=sc.nextInt(),tx=sc.nextInt(),ty=sc.nextInt();
		int uc=0,rc=0,sx1=sx,sy1=sy;List<Character> list=new ArrayList<Character>();
		while(sy1<ty)
		{
			list.add('U');uc++;sy1++;
		}
		while(sx1<tx)
		{
			list.add('R');rc++;sx1++;
		}
		int tx1=tx,ty1=ty;int dc=0;
		while(ty1>sy)
		{
			list.add('D');dc++;ty1--;
		}
		while(tx1>sx)
		{
			list.add('L');tx1--;
		}
		int curr_x=sx;curr_x--;int curr_y=sy+uc+1;sx1=sx;sy1=sy;
		while(sx1>curr_x)
		{
			list.add('L');sx1--;
		}
		while(sy1<curr_y)
		{
			list.add('U');sy1++;
		}
		while(curr_x<tx)
		{
			list.add('R');curr_x++;
		}
		while(curr_y>ty)
		{
			list.add('D');curr_y--;
		}
		curr_x=tx+1;
		while(tx<curr_x)
		{
			list.add('R');tx++;
		}
		curr_y=ty-dc-1;
		while(ty>curr_y)
		{
			list.add('D');ty--;
		}
		while(curr_x>sx)
		{
			list.add('L');curr_x--;
		}
		while(curr_y<sy)
		{
			list.add('U');curr_y++;
		}
		for(char ch:list)
		{
			out.print(ch);
		}
		out.println("");out.close();
    }
}
class Pair
{
	int x,y;
	public Pair(int x,int y)
	{
		this.x=x;this.y=y;
	}
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}