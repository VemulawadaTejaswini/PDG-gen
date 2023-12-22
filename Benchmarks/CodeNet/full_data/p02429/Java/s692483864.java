import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j = 0, pow, input = 0, k, m;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			k = sc.nextInt();
			int[] a = new int[n];
			List<Integer> b = new ArrayList<>();
			for(i = 0; i < k; i++) {
				input = sc.nextInt();
				for(;j < input; j++) {
					b.add(j);
				}
				j = j + 1;
			}
			pow = (int) (Math.pow(2, j));
//			for(Integer output : b) {
//				System.out.print(output + " ");
//			}
			for(i = 0; i < pow; i++) {
				m = i;
				for(j = 0; m != 0; j++) {
					if(m % 2 == 1) {
						a[j] = 1;
					}else {
						a[j] = 0;
					}
					m /= 2;
				}
				boolean bool = false;
				for(j = 0; j < b.size(); j++) {
					if(a[b.get(j)] != 0) {
						bool = true;
						break;
					}
				}
				if(bool) continue;
				System.out.print(i + ":");
				for(j = 0; j < a.length; j++) {
					if(a[j] == 1) {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}
