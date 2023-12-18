import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[] = new int[100000000];
		int H2[] = new int[100000000];
		int a = 0;
		int b = 0;
		int cnt = 0;

		for(int i=0; i<N; i++){
			H[i] = sc.nextInt();
		}

		for(int i=0; i<M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (H[a-1] < H[b-1]) {
				H2[b-1] = H2[b-1]+1;
				H2[a-1] = -10000;
			}else if(H[a-1] > H[b-1]) {
				H2[a-1] = H2[a-1]+1;
				H2[b-1] = -10000;
			}else if(H[a-1] == H[b-1]) {
				H2[a-1] = -10000;
				H2[b-1] = -10000;
			}
		}

		for(int i=0; i<N; i++) {
			if(H2[i] >= 0 ) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}