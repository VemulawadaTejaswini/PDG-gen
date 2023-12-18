import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		// practice contest
 
		Scanner sc = new Scanner(System.in);
 
		int a = sc.nextInt();
 
		int[] num = new int[100];
		int i;
		int j = 1;
		for (i = 0; i < 100; i++) {
			num[i] = j;
			j++;
		}
 
		 double l = 0;
       double m = 0;
		for (int k = 0; k < (num.length) / 2; k = k + 2) {
			l = l + 1;
			if (a == num[k] || a == num[k + 1]) {
				m = l;
				double answer =m/ a;
				System.out.println(answer);
			}
		}
	}
}