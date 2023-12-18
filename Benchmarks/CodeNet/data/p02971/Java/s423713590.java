import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		Integer max = max(a);
		Integer second = second(a);
		for(int i=0; i<n; i++) {
			if(a[i] == max) {
				System.out.println(second);
			}else {
				System.out.println(max);
			}
		}
	}
	
	public static Integer max(Integer[] a) {
		Arrays.parallelSort(a, Comparator.reverseOrder());
		return a[0];
	}
	public static Integer second(Integer[] a) {
		Arrays.parallelSort(a, Comparator.reverseOrder());
		return a[1];
	}
}
