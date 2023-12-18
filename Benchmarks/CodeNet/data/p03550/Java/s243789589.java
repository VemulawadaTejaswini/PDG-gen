import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Z = sc.nextInt(), W = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		sc.close();
		
		int ans = 0;
		//yの初期カードを使う場合
		ans = Math.abs(W - a[N-1]);
		
		//xが取り切る場合
		int x_nm = a[N-1];
		for(int i=0;i<N-1;i++) {
			int y_nm = a[i];
			ans = Math.max(ans, Math.abs(x_nm - y_nm));
		}
		//yが取り切る場合
		int y_nm = a[N-1];
		for(int i=0;i<N-1;i++) {
			x_nm = a[i];
			ans = Math.max(ans, Math.abs(x_nm - y_nm));
		}
		System.out.println(ans);
		
		
	}
}