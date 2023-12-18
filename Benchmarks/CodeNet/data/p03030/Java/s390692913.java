import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());int p = 0;String s = "";
		String[] a = new String[n];
		for(int i = 0; i < n; i++) {
			s = sc.next();p = 1100 - Integer.parseInt(sc.next());
			a[i] = s + "_" + String.valueOf(p) + "_" + String.valueOf(i+1);
		}
		Arrays.parallelSort(a);
		for(String a_i : a) {
			System.out.println(a_i.split("_")[2]);
		}
		sc.close();
	}
}