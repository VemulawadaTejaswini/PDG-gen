import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//Aの本の冊数
		int m = sc.nextInt();//Bの本の冊数
		int k = sc.nextInt();//時間
		long hako[]=new long [n];//一冊当たりの時間
		long list[]=new long [m];//一冊当たりの時間
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextLong();
		}
		for(int j=0;j<m;j++) {
			hako[j]=sc.nextLong();
		}
		
		while(a<n && b<m) {
			if(hako[a]<=list[b] && hako[a]<=k) {
				k-=hako[a];
				ans++;
				a++;
			}
			else if(hako[a]>list[b] && list[b]<=k) {
				k-=list[b];
				ans++;
				b++;
			}
			else {
				break
				
				;
			}
		}
		while(a<n) {
			if(hako[a]<=k) {
				k-=hako[a];
				ans++;
				a++;
			}
			else {
				break;
			}
		}
		while(b<m) {
			if(list[b]<=k) {
				k-=list[b];
				ans++;
				b++;
			}
			else {
				break;
			}
		}
		
		System.out.println(ans);
	}

}
