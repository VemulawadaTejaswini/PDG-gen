import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[]=new int[N+1];
		int ans= 0;
		for(int i=1;i<=N;i++){
			h[i]=sc.nextInt();
		}
		for(int i=1;i<=N;i++){
			if (h[i]>=K){
				ans=ans+1;
			}
		}
		System.out.println(ans);
    }
}