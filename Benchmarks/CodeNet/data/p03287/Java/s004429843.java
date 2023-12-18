import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int[] ame=new int[n+1];
		ame[0]=0;
		for(int i=0; i<n; i++) {
			ame[i+1]=sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			ame[i]=(ame[i]+ame[i-1])%m;
		}
		Arrays.sort(ame);
		long sousu=0;
		int genzai=0;
		int dist=0;
		for(int i=0; i<=n; i++) {
			if(ame[i]==genzai) {
				dist++;
			}
			else if(ame[i]!=genzai) {
				sousu+=dist*(dist-1)/2;
				genzai=ame[i];
				dist=1;
			}
		}
		sousu+=dist*(dist-1)/2;
		System.out.println(sousu);
	}

}
