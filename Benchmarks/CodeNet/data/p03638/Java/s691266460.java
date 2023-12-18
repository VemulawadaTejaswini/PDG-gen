import java.io.PrintWriter; 
import java.util.Scanner; 

public class Main
{
	static Scanner in; 
	static PrintWriter out; 

	static void solve()
	{ 
		int H = in.nextInt();
		int W = in.nextInt(); 
		int N = in.nextInt(); 
		int[] a = new int[N]; 
		String S = "";
		for(int i = 0; i < N; i++) 
		{ 
			a[i] = in.nextInt(); 
		} 
		for (int i = 0; i < a.length; i++) 
		{ 
			for(int j = 0; j < a[i]; j++)
			{ 
				S += i + 1;
			}
		} 
		for (int i = 0; i < H; i++) 
		{ 
			for(int j = 0; j < W; j++)
			{ 
				if (j != 0 && j != W-1)
				{ 
					out.print(" "); 
				} 
				if(i % 2 == 0)
				{ 
					out.print(S.charAt(W*i+j)); 
				}
				else
				{ 
					out.print(S.charAt(W*i+(W-1)-j));      
				} 
			} 
			out.println(); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		in = new Scanner(System.in); 
		out = new PrintWriter(System.out); 
		solve(); 
		out.flush(); 
		out.close(); 
		in.close(); 
	} 
}