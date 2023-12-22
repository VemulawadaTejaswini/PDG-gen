
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		while(true){
			Scanner sc=new Scanner(System.in);
			int INF=1000;
			int cnt=0;
			int n=sc.nextInt();
			int[] prime=new int[n+1];
			for(int i=0;i<=n;i++){
				prime[i]=INF;
			}
			for(int i=2;i<=n;i++){
				if(prime[i]==INF&&n%i==0){
					prime[i]=0;
					cnt++;
					for(int j=2;j*i<=n;j++){
						prime[j*i]=1;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}