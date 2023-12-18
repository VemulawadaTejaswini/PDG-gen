import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 繰り返し回数の入力
		int N = sc.nextInt();
		int P[] = new int[N];
		int sum=0;
		int max_old=0;
		int max_new=0;
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				max_new = P[i];
				max_old = P[i+1];
				for(int k=i+1;k<=j;k++) {
					if(max_new<P[k]) {
						max_old = max_new;
						max_new = P[k];
					}else if(max_old < P[k]){
						max_old = P[k];
					}
				}
//				System.out.println("暫定１位は "+ max_new);
//				System.out.println("暫定２位は "+ max_old);
//				System.out.println();
				sum += max_old;
			}
		}
		sc.close();
		System.out.println(sum);
	}
}