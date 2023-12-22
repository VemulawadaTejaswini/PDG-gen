import java.util.*;
import java.io.*;
public class Main {
///////----------------input----------------//////
	static BufferedReader br= new BufferedReader(new
            InputStreamReader(System.in)); 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st; 
	static byte[] buffer =new byte[10*1024];
	static int index;
    static InputStream input_stream= System.in;
    static int total;
	
	static String ns() throws IOException
    { 
		 StringBuilder sb = new StringBuilder();
         int n = read();
         while (isWhiteSpace(n))
             n = read();
         while (!isWhiteSpace(n)) {
             sb.append((char)n);
             n = read();
         }
         return sb.toString();
    } 
	
	static int read() throws IOException
	{
		if(total<0)
            throw new InputMismatchException();
        if(index>=total) {
            index=0;
            total= input_stream.read(buffer);
            if(total<=0)
                return -1;
        }
        return buffer[index++];
	}
	static int ni() throws IOException
    { 
		int integer=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        int neg=1;
        if(n=='-') {
            neg=-1;
            n= read();
        }
        while(!isWhiteSpace(n)) {
            if(n>='0'&&n<='9') {
                integer*=10;
                integer+=n-'0';
                n= read();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    } 

	static long nl() throws IOException
    { 
		long number=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        long neg=1l;
        if(n=='-') {
            neg=-1l;
            n= read();
        }
        while(!isWhiteSpace(n)) {
            if(n>='0'&&n<='9') {
                number*=10l;
                number+=(long)(n-'0');
                n= read();
            }
            else throw new InputMismatchException();
        }
        return neg*number;
    } 

	static double nd() throws IOException
    { 
		double doub=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        int neg=1;
        if(n=='-') {
            neg=-1;
            n= read();
        }
        while(!isWhiteSpace(n)&&n!='.') {
            if(n>='0'&&n<='9') {
                doub*=10;
                doub+=n-'0';
                n= read();
            }
            else throw new InputMismatchException();
        }

        if(n=='.') {
            n= read();
            double temp=1;
            while(!isWhiteSpace(n)) {
                if(n>='0'&&n<='9') {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n= read();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    } 

	static String nsl() throws IOException
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
	static boolean isWhiteSpace(int n) {
        if(n==' '|| n=='\n'|| n=='\r'|| n=='\t'|| n==-1)
            return true;
        return false;
    }
	
	///////-------------output-----------------//////
	static public void p(String str) throws IOException {
        bw.append(str);
    }
	static public void pn(String str) throws IOException {
        p(str);
        bw.append("\n");
    }
	static public void close()throws IOException {
        bw.close();
    }
	static public void flush()throws IOException {
        bw.flush();
    }
	
	///////----------THE FAST I/O METHODS ENDS HERE -----------/////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////// FOR INPUT LOOP//////////////////////////////
	public static  int[] loopi(int[] arr,int n) throws IOException
	{
		for(int i=0;i<n;i++)
			arr[i]=ni();
		
		return arr;
	}
	public static  String[] loops(String[] arr,int n) throws IOException
	{
		for(int i=0;i<n;i++)
			arr[i]=ns();
		
		return arr;
	}
	public static  long[] loopl(long[] arr,int n) throws IOException
	{
		for(int i=0;i<n;i++)
			arr[i]=ni();
		
		return arr;
	}
	/////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////
	static class Node implements Comparable<Node>{
		int h;
		int w;
		Node(int h,int w)
		{
			this.h=h;
			this.w=w;
		}
		public static String toString(Node n)
		{
			return n.h+" "+n.w;
		}
		@Override
		public int compareTo(Node n)
		{
			
				return this.h-n.h;
		}
	
	}
	
	static boolean al[]=new boolean[1100000];
	  public static void prime()
	  {
	    int n=1000000;
	   
	    for(int i=2;i*i<=n;i++)
	    {
	      if(!al[i]){
	      for(int j=i*2;j<=n;j+=i)
	      {
	        al[j]=true;
	      }
	        
	      }
	    }
	  }
	  public static int count=0;
	 static boolean com[]=new boolean[120000];
	  public static void dfs(int p,int n,ArrayList<Integer> al[],Boolean visited[])
	{
		if (visited[n]) {
			if (!com[n])
				count++;
			return;
		}
		visited[n] = true;
		for(int i:al[n])
		{
			if (i!=p)
				dfs(n,i,al,visited);
					//return true;
			
				
		}
		com[n]=true;
		//return false;
	}
	static int mex(int start,int end,int arr[])
	{
		int min=Integer.MAX_VALUE;
		if(arr[0]>0)
			return 0;
		for(int i=start;i<end-1;i++)
		{
			System.out.println(i);
			if(arr[i+1]==arr[i]+1||arr[i+1]==arr[i])
			{
				System.out.println("equal");
				continue;
			}
			else 
			{
				
				min=arr[i]+1;
				System.out.println(arr[i]+1+" "+min);
				break;
			}
		}
		return min;
	}

	  public static void main(String args[]) throws IOException {
		int temp=ni();
		pn((temp^1)+"");
		flush();
}
	  }


