import java.util.Scanner;

public class Main {
	static int N;
	static int count;
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			N = Integer.parseInt(sc.next());
			int a[] = new int[N]; 
			for(int i=0;i<N;i++) {
				a[i] = Integer.parseInt(sc.next());
			}
			for(int i=0;i<N-1;i++) {
				for(int j=0;a[i]>a[i+1];j++) {
					count++;
					a[i+1] += 1;
				}
			}
			System.out.println(count);
		}
	}
}
