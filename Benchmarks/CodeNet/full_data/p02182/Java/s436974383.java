import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] field = new char[n][];
		for (int i = 0; i < n; i++) {
		    field[i] = sc.next().toCharArray();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (int j = 0; j < m; j++) {
		        if (arr[j] != field[i][j]) {
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}

