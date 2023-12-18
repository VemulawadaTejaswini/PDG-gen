import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
		int N = readInt();
		int[] coor = new int[N+2];
		
		coor[0] = 0;
		coor[N+1] = 0;
		for (int i=1; i<=N; i++){
			coor[i] = readInt();
		}
		int[] temp = new int [N+1];
		for (int i=1; i<=N; i++){
			int total = 0;
			for (int j=0; j<=N; j++){
				if (j>=i){
					temp[j] = coor[j+1];
				}else{
					temp[j] = coor[j];
				}
			}
			for (int j=1; j<=N; j++){
				total+=Math.abs(temp[j]-temp[j-1]);
			}
			
			System.out.println(total);	
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