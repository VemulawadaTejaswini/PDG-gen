import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();

		Arrays.sort(a);

		for(int j=0;j<m;j++){
			int k=0;
			int b = sc.nextInt();
			int c = sc.nextInt();
			while(k<b&&a[k]<c){
				a[k]=c;
              	k++;
			}
			Arrays.sort(a);
		}

		long ans = 0;

		for(int x:a)ans+=x;

		// 出力
		System.out.println(ans);
	}
}