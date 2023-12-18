import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for (int i=0; i<N; i++) {
			d[i] = sc.nextInt(); 
		}
		int count = 1;
		for (int i=0; i<N; i++) {
			if ( i > 0 && d[i] < d[i-1] ) count ++;
		}
		System.out.println(count);
	}
}
