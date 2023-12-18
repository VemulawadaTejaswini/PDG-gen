import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a;
		int index = 0;
		int ans = 0;

		for(int i = 0; i < N;i++){
			a= sc.nextInt();
			if(a == 1)
				index = i + 1;
		}

		if(N==K){
			ans = 1;
		}else{

			for(int i = index - 1;i>0;i = i - (K-1)){
				ans++;			}

			for(int i = N - index;i>0;i = i - (K-1)){
				ans++;
				}
		}

		System.out.println(ans);
	}
}
