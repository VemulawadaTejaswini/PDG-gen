import java.util.Scanner;
public class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();		//要素数
		int[] a=new int[n];		//要素
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();		//入力
		}
		long ans=0;		//総数答え
		int right=0;	//右（しゃくとり）
		long xor=0,sum=0;	//XOR答え　合計
		for (int left = 0; left < n; left++) {	//左を固定する
			while (right<n&&(xor^a[right])==sum+a[right]){	//橋にはまだ到達していない　かつ　和とXORが等しい
				xor^=a[right];	//次に進める
				sum+=a[right];
				right++;
			}
			ans+=right-left;	//答え
			if(right==left)right++;
			else {
				sum-=a[left];
				xor^=a[left];	//左
			}
		}
		System.out.println(ans);
	}
}
