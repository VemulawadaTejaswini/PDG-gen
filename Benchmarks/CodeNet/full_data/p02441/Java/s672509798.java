import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int[] A = new int[n];
			for(int i=0; i<n;i++) {
				A[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			for(int i=0; i<q;i++) {
				int b = sc.nextInt();
				int e = sc.nextInt();
				int k = sc.nextInt();
				int cnt = 0;
				for(int j=b;j<e;j++) {
					if(A[j]==k) cnt++;
				}
				System.out.println(cnt);
			}
		}
	}
}
