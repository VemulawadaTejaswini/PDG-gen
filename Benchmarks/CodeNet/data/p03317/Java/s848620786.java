
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int k = stdin.nextInt();
		int memo=0;
		int val=10000000;
		int ans=10000000;
		int x[] = new int[n];
		for(int i=0;i<n;i++) {
			x[i]=stdin.nextInt();
			if(x[i]==1)memo=i;
		}
		if(memo+1<=k||memo+1>=n-k) { //はじっこ
			ans=(n-2)/(k-1)+1;
		}else {
			for(int j=0;j<k-1;j++) {
				val=(memo-j+k-2/(k-1))+((n-memo+j-1)/(k-1))+1;
				if(val<ans) {
					ans=val;
				}
			}
		}
		System.out.println(ans);


	}

}
