import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A []= new int[3];
		for (int i=0;i<3;i++) {
			A[i]= sc.nextInt();
		}
		Arrays.parallelSort(A);
		if (A[0]==A[1]&&A[1]==5&&A[2]==7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}