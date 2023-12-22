
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		String s = "" + ary[n - 1];
		for(int i = n - 2; i >= 0; i--){
			s += " " + ary[i];
		}
		System.out.println(s);
	}
}

