import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int wk=0;
		int ans=-1;
		int sum=0;
		for(int i=1;i<=M;i++){
			wk=0;
			wk=sc.nextInt();
			sum=sum+wk;
		}
		if (N<sum) {
		System.out.println(ans);
		}
		else{
		ans=N-sum;
		System.out.println(ans);
		}
    }
}