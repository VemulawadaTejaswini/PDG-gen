import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];
		
    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}
    	
    	// Shell Sort
    	cnt = 0;
    	int[] g;
//    	int m = (n - 1) / 3 + 1;
//    	if (m < 1) {
//        	g = new int[m];
//        	for (int i = m - 1; i >= 0; i --) {
//        		g[i] = 3 * i + 1;
//        	}
//    	} else {
//    		g = new int[100];
//    		m = 0;
//    		g[m] = 1;
//    		m++;
//    		for (int next = g[0] * 3 + 1, i = 1; next < n; i++, m++, next = g[i - 1] * 3 + 1) {
//    			g[i] = next;
//    		}
//    	}
    	
    	int m = (int)Math.pow(n, 1.25);
    	if (m > 100) {
    		m = 100;
    	}
		g = new int[m];
		int tmpm = 0;
		g[tmpm] = 1;
		tmpm++;
		for (int i = 1; i < m; i++, tmpm++) {
			int next = g[i - 1] * 3 + 1;
			if (next > n) {
				break;
			}
			g[i] = next;
		}
		m = tmpm;
    	
    	for (int i = 0; i < m; i++) {
    		insertionSort(data, n, g[m - 1 - i]);
    	}

    	// m
    	System.out.println(m);
    	// g
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < m; i++) {
			printData.append(g[m - 1 - i]);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);
    	// cnt
    	System.out.println(cnt);
    	// data
		for (int i = 0; i < data.length; i++) {
	    	System.out.println(data[i]);
		}

    	sc.close();
	}
	
	private static void insertionSort(int[] data, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = data[i];
			int j = i - g;
			for (; j >= 0 && data[j] > v;) {
				data[j + g] = data[j];
				j -= g;
				cnt++;
			}
			data[j + g] = v;
		}
		return;
	}
}