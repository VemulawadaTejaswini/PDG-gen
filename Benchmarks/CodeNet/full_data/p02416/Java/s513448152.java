import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,ans;
		while(true){
			n=Math.abs(scan.nextInt());
			ans=0;
			if(n==0) break;
			ans+=(n/1000);
			n=n-((n/1000)*1000);
			ans+=(n/100);
			n=n-((n/100)*100);
			ans+=(n/10);
			n=n-((n/10)*10);
			ans+=n;
			System.out.println(ans);
		}
		scan.close();
	}
}