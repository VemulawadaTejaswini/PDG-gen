import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N_=0;
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<N;i++){
			if(a[i] == N_+1){
				N_++;
			}
		}
		sc.close();
		if(N_==0){
			System.out.println(-1);
		}else{
			System.out.println(10-N_);
		}

	}
}
