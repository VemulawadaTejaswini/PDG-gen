import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] l = new int[n];
		Arrays.setAll(l, i -> sc.nextInt());
		
		int i = 0;
		int dis = 0;
		while (dis < x && i < n) {
			dis += l[i];
			if (dis <= x) i++;
		}
		
		System.out.println(i + 1);
		
		sc.close();
	}
	
}


