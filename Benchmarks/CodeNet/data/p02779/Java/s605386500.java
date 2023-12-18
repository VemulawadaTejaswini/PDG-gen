import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextLong();
		}


		for(int i=0;i<N-1;i++) {
			for(int j=i+1; j<N; j++) {
	//			System.out.println("ai:"+a[i]);
	//			System.out.println("aj:"+a[j]);

				if(a[i]==a[j]) {
					System.out.println("NO");
					return;
				}
			}
		
		}
		System.out.println("YES");
		

	}
}