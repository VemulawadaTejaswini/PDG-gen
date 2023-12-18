import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			if(a[i] > first) {
				first = a[i];
			}else if(a[i] > second) {
				second = a[i];
			}
		}
		for(int i = 0; i < N; i++) {
			if(a[i] != first) System.out.println(first);
			else System.out.println(second);
		}
	}
}
