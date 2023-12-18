import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int d[] = new int[101];
		int cnt[] = new int[101];
		int n = 0;
		int cntA = 0;
		
		for(int i=0; i<K; i++){
			d[i] = sc.nextInt();
			for(int j =0; j<d[i]; j++) {
				n =sc.nextInt();
				cnt[n-1] = cnt[n-1]+1;
			}
		}		
		
		for(int i=0; i<N; i++) {
			if(cnt[i] == 0) {
				cntA +=1;
			}
		}

		System.out.println(cntA);
		sc.close();
	}
}