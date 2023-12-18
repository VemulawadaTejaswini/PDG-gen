import java.util.Scanner;


public class Main{
	static int dfs(int n) {
		if(n<=9) {
			return n;
		}
		return dfs(n/10)+n%10;
	}
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int N=sc.nextInt();
    		int A=sc.nextInt();
    		int B=sc.nextInt();
    		int sum=0;
    		for(int i=1; i<=N; i++) {
    			if(A<=dfs(i) && dfs(i)<=B) {
    				sum+=i;
    			}
    		}
    		System.out.println(sum);
    	}
    }
}