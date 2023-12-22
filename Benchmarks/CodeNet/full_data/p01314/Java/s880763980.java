import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ2197().doIt();
	}
	
	class AOJ2197{
		
		boolean calc(int index,int n){
			if(index==n)return false;
			int sum = 0;
			for(int i=index;i<=1000;i++){
				sum+=i;
				if(sum==n)return true;
				else if(sum>n)return false;
			}
			return false;
		}
		
		int solve(int n){
			int result = 0;
			for(int i=1;i<n;i++)if(calc(i, n)){
				result++;
			}
			return result;
		}
		
		void doIt(){
			while(in.hasNext()){
				int n = in.nextInt();
				if(n==0)break;
				System.out.println(solve(n));
			}
		}
	}
	
}