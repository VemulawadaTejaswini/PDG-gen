import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n+1];
		for(int i=1;i<n+1;i++)a[i]=1;

		for(int j=0;j<m;j++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			a[y]=0;
		}

		int ans = 0;
		for(int i=1;i<n+1;i++)ans+=a[i];

		// 出力
		System.out.println(ans);
	}
}