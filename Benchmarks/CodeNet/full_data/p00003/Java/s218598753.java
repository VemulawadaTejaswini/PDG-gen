import java.util.Scanner;

public class Main{
	static boolean rightA(int a, int b, int c){
		int max = a;
		if( b > a ){
			int temp = a;
			a = b;
			b = temp;
		}
		if( c > a ){
			int temp = a;
			a = c;
			c = temp;
		}
		
		if( a*a == b*b + c*c )
			return true;
		else return false;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		String[] str = new String[n+1];
		String[][] s = new String[n][3];
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n+1; i++){
			str[i] = stdIn.nextLine();
		}
		for(int i = 0; i < n; i++){
			s[i] = str[i+1].split(" ", 3);
			a[i] = Integer.parseInt(s[i][0]);
			b[i] = Integer.parseInt(s[i][1]);
			c[i] = Integer.parseInt(s[i][2]);
		}
		
		for(int i = 0; i < n; i++){
			if( rightA(a[i], b[i], c[i]) ){
				System.out.println("YES");
			}
			else 
				System.out.println("NO");
		}
	}
}