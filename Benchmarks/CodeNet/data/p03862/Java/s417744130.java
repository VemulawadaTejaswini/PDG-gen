import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
		}
		long ans=0;
		for(int i = 0;i < N-1;i++){
			if(a[i] + a[i+1] > x){
				long minus = a[i] + a[i+1] - x;
				ans += minus;
				if(i%2 == 0){
					a[i+1] -= minus;
					
				}else{
					a[i] -=minus;
					
				}
			}
		}
		System.out.println(ans);


	}
}