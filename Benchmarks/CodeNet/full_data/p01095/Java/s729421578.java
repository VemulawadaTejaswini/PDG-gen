import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if (n == 0 && m == 0) {
		        break;
		    }
		    boolean[] years = new boolean[8000000];
		    int idx = n;
		    for (int i = 0; i <= m; i++) {
		        while (years[idx]) {
		            idx++;
		        }
		        for (int j = 1; j * idx < years.length; j++) {
		            years[j * idx] = true;
		        }
		    }
	        sb.append(idx).append("\n");
		}
		System.out.print(sb);
	}
}

