import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			if(i>0) {
				for(int j=0;j<i;j++) {
					if(A[i]%A[j]==0) {
						B[i] = 1;
						break;
					}
				}
				for(int j=0;j<i;j++) {
					if(A[j]%A[i]==0) {
						B[j]=1;
					}
				}
			}
		}
		int ans =0;
		for(int i=0;i<N;i++) {
			ans += B[i];
		}
		System.out.println(N-ans);
	}
}