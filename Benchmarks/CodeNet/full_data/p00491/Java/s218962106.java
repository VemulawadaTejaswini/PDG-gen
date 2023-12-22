//package AOJ;
import java.util.*;
import static java.lang.Math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int days = N - K;
		int[] Aidx = new int[K];
		//int[] A = new int[K];
		//int[] B = new int[K];
		int[] ptable = new int[N];
		for(int i = 0; i < N; i++) ptable[i] = 1;
		for(int i = 0; i < K; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			ptable[A - 1] = B;
			Aidx[i] = A;
		}
		Arrays.sort(Aidx);
		System.out.println(Searchtable(ptable, Aidx, N - K));
		System.exit(0);
	}
	
	static int Searchtable(int[] ptable, int[] Aidx, int days) {
		int result = 0;
		int deep = 0;
		result += check(ptable);
		for(int i = 0; i < (int)pow(3.0,(double)days) - 1; i++) {
			ptable[Aidx[deep]] += 1;
			while(true) {
				if(ptable[Aidx[deep]] == 4) {
				ptable[Aidx[deep]] = 1;
				deep++;
				ptable[Aidx[deep]]++;
				} else {
					break;
				}
			}
			result += check(ptable);
			deep = 0;
		}
		return result % 10000;
		
	}
	
	static int check(int[] ptable) {
		for(int i = 0; i < ptable.length; i++) {
			if(i >= 2 && ptable[i] == ptable[i - 1]
					  && ptable[i - 1] == ptable[i - 2]) {
				return 0;
			}
		}
		return 1;
	}
}