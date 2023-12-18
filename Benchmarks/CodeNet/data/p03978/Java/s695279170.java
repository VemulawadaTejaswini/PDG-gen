import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static String INPUT = "";
	
	static String F = ".#";
	
	static boolean trial(int l, int r, int t, char[][] map)
	{
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < 2;j++){
				map[0][t] = F.charAt(i);
				map[1][t] = F.charAt(j);
				for(int k = l;k < r;k++){
					out.print(map[0][k]);
				}
				out.println();
				for(int k = l;k < r;k++){
					out.print(map[1][k]);
				}
				out.println();
				out.flush();
				char res = in.next().charAt(0);
				if(res == 'T'){
					return true;
				}
			}
		}
		return false;
	}
	
	static void solve()
	{
		int n = ni();
		char[][] map =  new char[2][400];
		int l = 200, r = 201;
		trial(l, r, l, map);
		while(true){
			if(!trial(l, r+1, r, map))break;
			r++;
		}
		while(true){
			if(!trial(l-1, r, l-1, map))break;
			l--;
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
	}
	
	static int ni() { return Integer.parseInt(in.next()); }
	static long nl() { return Long.parseLong(in.next()); }
	static double nd() { return Double.parseDouble(in.next()); }
	static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
