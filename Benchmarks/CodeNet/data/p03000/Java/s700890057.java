import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			l[i] = sc.nextInt();
		}
		int d = 0;
		int count = 1;
		for(int i = 1; i <= n; i++) {
			if(d + l[i] <= x) {
				d += l[i];
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
