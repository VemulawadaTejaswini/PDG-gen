import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int i;
		for(i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		int x = a[0];
		int y = a[N-1];
		int temp = N-2;
		int j = 1;
		if(N != 2){
			for(i=1;i<N-1;i++){
				int ans1 = x + a[j] -y;
				int ans2 = x - a[temp] - y;
				if(ans1 < 0)
					ans1 *= -1;
				if(ans2 < 0)
					ans2 *= -1;
				if(ans1 < ans2){
					x += a[j];
					j++;
				}else{
					y += a[temp];
					temp--;
				}
			}
		}
		int ans = (x-y)>0?(x-y):(y-x);
		System.out.println(ans);
		sc.close();
	}

}

