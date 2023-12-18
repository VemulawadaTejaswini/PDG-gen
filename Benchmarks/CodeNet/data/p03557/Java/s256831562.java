import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 文字列の入力
		//String s1 = sc.next();

		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for(int i=0;i<n;i++){
			b[i] = sc.nextInt();
		}
		int[] c = new int[n];
		for(int i=0;i<n;i++){
			c[i] = sc.nextInt();
		}

		int[] b_num = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(b[i]<c[j]){
					b_num[i]++;
				}
			}
		}

		int ans = 0;
		//int[] a_num = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]<b[j]){
					ans+=b_num[j];
				}
			}
		}

		//int ans = 0;
		//for(int i=0;i<n;i++){
		//	ans+=a_num[i];
		//}

		// 出力
		System.out.println(ans);
	}
}
