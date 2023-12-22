import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0276();
	}
	
	class AOJ0276{
		public AOJ0276() {
			while(in.hasNext()){
				int a = in.nextInt();
				int b = in.nextInt();
				System.out.println(a-b);
			}
		}
	}


}