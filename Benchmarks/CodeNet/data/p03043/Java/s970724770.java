import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		int k = sc.nextInt();
		double ans=0;
		for(int i = 1; i<=n; i++){
			int p=i;
			double q=1;
			while(p<k){
				p*=2;
				q*=2;
			}
			q*=n;
			ans+=1/q;
		}
		System.out.println(ans);
	}
}
