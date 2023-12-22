import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0086().doIt();
	}
	
	class AOJ0086{
		int[] memo;
		boolean solve(){
			if(memo[1]%2==0||memo[2]%2==0)return false;
			for(int i=3;i<1000;i++)if(memo[i]%2!=0)return false;
			return true;
		}
		
		void doIt(){
			memo = new int[1000];
			while(in.hasNext()){
				int a = in.nextInt();
				int b = in.nextInt();
				if(a==0&&b==0){
					boolean ans = solve();
					System.out.println(ans? "OK":"NG");
					memo = new int[1000];
				}
				memo[a]++;memo[b]++;
			}
		}
	}
	
}