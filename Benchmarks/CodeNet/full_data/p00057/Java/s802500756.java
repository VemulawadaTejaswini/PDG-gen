import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0057();
	}
	
	class AOJ0057{
		public AOJ0057() {
			int[] ans = new int[100001];
			for(int i=1;i<=100000;i++)ans[i] = ((i+1)*i)/2+1;
			while(in.hasNext())System.out.println(ans[in.nextInt()]);
		}
	}
}