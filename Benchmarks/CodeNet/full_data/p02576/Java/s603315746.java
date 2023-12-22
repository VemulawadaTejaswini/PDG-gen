import java.util.Scanner;

public class Main {
	static int N;
	static int X;
	static int T;
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			N = Integer.parseInt(sc.next());
			X = Integer.parseInt(sc.next());
			T = Integer.parseInt(sc.next());
		}
		int count=0;
		for(int i=0;N>X*i;i++) {
			count++;
		}
		if(count==0) {
			System.out.println(1);
		}else {			
			System.out.println(count*T);
		}
	}
}