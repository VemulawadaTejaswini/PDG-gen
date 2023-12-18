import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int keta=0;
		int ans=0;
		for(int i=1;i<=N;i++){
			keta = String.valueOf( i ).length();
			if ((keta%2)==1) {
				ans=ans+1;
			}
		}
		System.out.println(ans);
    }
}