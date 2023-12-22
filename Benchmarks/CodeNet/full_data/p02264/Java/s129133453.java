import java.util.Scanner;

public class Main {
	static int quantum = 0;
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		
		//プロセス数
		int n = scan.nextInt();
		String data[][] = new String[n][2];
		
		//クオンタム
		int q = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for ( int j = 0; j < 2; j++) {
				data[i][j] = scan.next();
			}
		}
		scan.close();
		
		Queue(data, n, q);
		
	}
	
	public static void Queue (String str[][], int n, int q) {
		int count = n;
		int head = 0;
		int top = n - 1;
		
		while (count > 0) {
			if ( str[head][1].equals("-")) {
			} else {
				str[head][1] = Quantum(Integer.parseInt(str[head][1]), q);
				if (str[head][1].equals("-")) {
					count--;
					System.out.println(str[head][0] + " " + quantum);	
				} 
			}
			head = head + 1;
			if (head > top) head = 0;
		}
	}
	
	public static String Quantum(int x, int q) {
		
		if ( x < q) {
			quantum += x % q;
			return "-";
		} else if (x == q) {
			quantum += q;
			return "-";
		} else {
			x -= q;
			quantum += q;
		}
		
		return Integer.toString(x);
		
	}
}
