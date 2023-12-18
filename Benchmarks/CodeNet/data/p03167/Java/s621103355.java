import java.util.*;
import java.io.*;

public class Main {
	static char [] [] mygrid;
	static int h;
	static int w;
	static long [][]mydpArr ;
	public static long dp(int x, int y) {
		if (x==h-1 &&y==w-1)
			return 1;
		if(x>=h || y>=w)
			return 0;
		if ((x+1>=h||mygrid [x+1][y] =='#')&&(y+1>=w||mygrid [x][y+1] =='#'))
				return mydpArr[x][y] =0;
		if (mydpArr[x][y] != -1)
			return mydpArr[x][y];
		if((x+1<h&&mygrid [x+1][y]  !='#')&&(y+1<w&&mygrid [x][y+1]  !='#'))
			return mydpArr[x][y]= dp(x+1,y) +dp (x,y+1);
		if(x+1<h&&mygrid [x+1][y]  !='#')
			return  mydpArr[x][y]= dp(x+1,y);
		return mydpArr[x][y]= dp (x,y+1);
			

	}
	public static void main(String[] args) throws IOException {
       //Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
//        h = sc.nextInt();
//        w = sc.nextInt();
      StringTokenizer st =  new StringTokenizer(br.readLine());
        h=Integer.parseInt( st.nextToken());
       w= Integer.parseInt( st.nextToken());
        mygrid = new char [h][w];
       for(int i =0;i<h;i++) {
    	String s=br.readLine();
    	  for(int j =0;j<w;j++) {
    		  mygrid[i][j]= s.charAt(j);
    	  }
    	   
       }
       mydpArr = new long[h][w];
       for(long x[]: mydpArr) {
    	   Arrays.fill(x, -1);
       }
       
        pw.print((long)dp(0,0)%1000000007);
        pw.close();
        }
	  static class Scanner {
	         BufferedReader br;
	         StringTokenizer st;
	 
	         public Scanner(InputStream s) {
	             br = new BufferedReader(new InputStreamReader(s));
	         }
	 
	         public String next() throws IOException {
	             while (st == null || !st.hasMoreTokens())
	                 st = new StringTokenizer(br.readLine());
	             return st.nextToken();
	         }
	 
	         public int nextInt() throws IOException {
	             return Integer.parseInt(next());
	         }
	 
	         public long nextLong() throws IOException {
	             return Long.parseLong(next());
	         }
	 
	         public double nextDouble() throws IOException {
	             return Double.parseDouble(next());
	         }
	 
	         public int[] nextIntArr(int n) throws IOException {
	             int[] arr = new int[n];
	             for (int i = 0; i < n; i++) {
	                 arr[i] = Integer.parseInt(next());
	             }
	             return arr;
	         }
	 
	     }
}