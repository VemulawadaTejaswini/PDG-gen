import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        //# is black, . is white
        int A = readInt(), B = readInt();
        char[][] grid = new char[100][100];
        for (int i=0; i<100; i++){
        	for (int j=0; j<50; j++){
        		grid[i][j] = '#';
        	}
        }
        for (int i=0; i<100; i++){
        	for (int j=50; j<100; j++){
        		grid[i][j] = '.';
        	}
        }
        A--; 
        B--;
        for (int i=0; i<100; i++){
        	for (int j=0; j<100; j++){
        		if (i%2==0 && j%2==0 && j<50 && A>0){
        			grid[i][j] = '.';
        			A--;
        		}else if (i%2==0 && j%2==1 && j>=50 && B>0){
        			grid[i][j] = '#';
        			B--;
        		}
        	}
        }
        System.out.println("100 " + "100");
        for (int i=0; i<100; i++){
        	for (int j=0; j<100; j++){
        		System.out.print(grid[i][j]);
        	}
        	System.out.println();
        }
        
	}
	static String next () throws IOException {
	    while (st == null || !st.hasMoreTokens())
	    st = new StringTokenizer(br.readLine().trim());
	    return st.nextToken();
	}

	static long readLong () throws IOException {
	    return Long.parseLong(next());
	}

	static int readInt () throws IOException {
	    return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
	    return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
	    return next().charAt(0);
	}

	static String readLine () throws IOException {
	    return br.readLine().trim();
	}
	
}