import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0278();
	}
	
	class AOJ0278{
		
		void doIt(){
			int x = in.nextInt(),y = in.nextInt(),a = in.nextInt(),b = in.nextInt();
			int result = Integer.MAX_VALUE;
			if(a>=5&&b>=2)result = (int)((x*a+y*b)*0.8);
			else if(a>=5)result = Math.min((int)((x*a+y*2)*0.8), x*a+y*b);
			else if(b>=2)result = Math.min((int)((x*5+y*b)*0.8), x*a+y*b);
			else result = Math.min((int)((x*5+y*2)*0.8), x*a+y*b);
			System.out.println(result);
		}
		
		public AOJ0278() {
			int n = in.nextInt();
			for(int i=0;i<n;i++)doIt();
		}
	}
	
}