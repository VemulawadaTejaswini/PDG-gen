import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] a = new int[N];

	for(int i=0;i<N;i++) {
		a[i] = sc.nextInt();
	}
	int answer =0;
	for(int i=0;i<N;i++) {
		for(int j=0;j<N;j++) {
			if(j!=i) {
				answer = Integer.max(answer,a[j]);
			}
		}

		System.out.println(answer);
		answer=0;
	}
}
}