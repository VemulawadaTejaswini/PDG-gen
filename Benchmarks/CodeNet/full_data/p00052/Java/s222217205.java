import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0052();
	}
	
	class AOJ0052{
		
		int doIt(int n){
			int result = 0;
			while(n>0){
				n=n/5;
				result += n;
			}
			return result;
		}
		
		public AOJ0052() {
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				System.out.println(doIt(n));
			}
		}
	}
}