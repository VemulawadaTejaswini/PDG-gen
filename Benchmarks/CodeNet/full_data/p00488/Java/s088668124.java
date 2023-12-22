import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0565();
	}

	class AOJ0565{
		public AOJ0565() {
			int a = Integer.MAX_VALUE;
			int b = Integer.MAX_VALUE;
			for(int i=0;i<3;i++)a = Math.min(a,in.nextInt());
			for(int i=0;i<2;i++)b = Math.min(b, in.nextInt());
			System.out.println(a+b-50);
		}
	}

}