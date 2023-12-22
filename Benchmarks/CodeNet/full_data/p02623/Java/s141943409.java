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
		int hako[]=new int [n];//一冊当たりの時間
		int list[]=new int [m];//一冊当たりの時間
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			list[j]=sc.nextInt();
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
				break;
			}
		}
		while(a<n) {
			if(hako[a]<=k) {
				k-=hako[a];
				ans++;
				a++;
			}
		}
		while(b<m) {
			if(list[b]<=k) {
				k-=list[b];
				ans++;
				b++;
			}
		}
		
		System.out.println(ans);
	}

}
