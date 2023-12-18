import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		List<Integer> list = new ArrayList<Integer>();
		int count = 1;
		int Hakai = 0;

		for(int i = 0;i < a.length;i++) {
			a[i] = sc.nextInt();
		}



		for(int i = 0;i < a.length;i++) {
			if(a[i] == count) {
				count++;
			}else {
				Hakai++;
			}
		}
		if(count-1 + Hakai == n && count != 1) {
			System.out.println(Hakai);
		}else {
			System.out.println(-1);
		}

	}

}
