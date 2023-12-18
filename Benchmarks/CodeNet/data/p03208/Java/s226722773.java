import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	    	int k = sc.nextInt();
	    	int[] h = new int[n];
	    	int min = 100000000;
	    	int temp = 0;
	    	List<Integer> list = new ArrayList<>();
	    	for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			list.add(h[i]);
		}
	    	Collections.sort(list);
	    	for (int i = 0; i <= n - k; i++) {
			temp = list.get(i+k-1) - list.get(i);
			if (temp < min) {
				min = temp;
			}
		}
	    	System.out.println(min);
	}
}
