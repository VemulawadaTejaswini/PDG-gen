import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = sc.nextInt();
    	}

		int q = sc.nextInt();
		int[] t = new int[q];
    	for (int i = 0; i < q; i++) {
    		t[i] = sc.nextInt();
    	}

    	Arrays.sort(s);
    	Arrays.sort(t);
    	
    	int count = 0;
    	for (int i = 0, key = 0; i < n && key < q;) {
    		if (s[i] < t[key]) {
    			i++;
    		} else if (s[i] == t[key]) {
    			count++;
    			i++;
    			key++;
//    			System.out.println(s[i]);
    		} else {
    			key++;
    		}
    	}
		
    	System.out.println(count);

    	sc.close();
	}
}