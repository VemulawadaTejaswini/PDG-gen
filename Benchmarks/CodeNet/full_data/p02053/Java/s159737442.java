import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] line = new int[w];
		Arrays.fill(line, Integer.MAX_VALUE);
		int max = 0;
		for (int i = 0; i < h; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (arr[j] == '.') {
		            continue;
		        }
		        for (int k = 0; k < w; k++) {
		            if (line[k] != Integer.MAX_VALUE) {
		                max = Math.max(max, Math.abs(j - k) + i - line[k]);
		            }
		        }
		        if (line[j] == Integer.MAX_VALUE) {
		            line[j] = i;
		        }
		    }
		}
		System.out.println(max);
	}
}

