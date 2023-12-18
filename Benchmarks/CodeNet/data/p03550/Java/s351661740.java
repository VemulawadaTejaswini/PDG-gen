import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();

		// 文字列の入力
		//String s = sc.next();

		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int s1 = Math.abs(z-w);
		int s2 = 0;
		if(n>=2){
			s2 = Math.abs(a[n-2]-a[n-1]);
		}
		int s3 = Math.abs(w-a[n-1]);

		int ans;
		if(s1>=s2 && s1>=s3){
			ans = s1;
		}else if(s2>=s1 && s2>=s3){
			ans = s2;
		}else{
			ans = s3;
		}

		// 出力
		System.out.println(ans);
	}
}
