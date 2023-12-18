import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int H = cin.nextInt();
		
		int a[] = new int[N];
		int b[] = new int[N];
		
		for (int i=0; i<N; i++) {
			a[i] = cin.nextInt();
			b[i] = cin.nextInt();
		}
		cin.close();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int index_a = a.length-1;
		int index_b = b.length-1;
		int attack = 0;
		
		while (true) {
			if (index_b >=0 && b[index_b] > a[index_a]) {
				H = H - b[index_b];
				index_b--;
			} else {
				H = H - a[index_a];
			}
			
			attack++;
			if (H <= 0) break;
		}
		
		System.out.println(attack);
	}

}
