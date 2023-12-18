import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		for(int i = 1;i < N-1;i++) {
			if(A[i-1]==A[i]) {
				if(A[i] < 9999) {
					A[i] = ++A[i]==A[i+1] ? A[i]+=2 : A[i]++;
				}else{
					A[i] = --A[i]==A[i+1] ? A[i]-=2 : A[i]--;
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}