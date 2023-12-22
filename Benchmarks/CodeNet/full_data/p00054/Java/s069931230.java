import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0054();
	}
	
	class AOJ0054{
		
		void doIt(int a,int b,int n){
			int result = 0;
			double f = (1.0*a/b)-(a/b);
			String f_a = Double.toString(f);
			int cnt = 0;
			for(int i=2;i<f_a.length();i++){
				if(cnt==n)break;
				result += Integer.parseInt(f_a.charAt(i)+"");
				cnt++;
			}
			System.out.println(result);
		}
		
		public AOJ0054() {
			while(in.hasNext())doIt(in.nextInt(), in.nextInt(), in.nextInt());
		}
	}
}