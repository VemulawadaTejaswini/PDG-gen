import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	int k =  sc.nextInt();
	int count = 0;
	Integer h[] = new Integer[n];

	for(int i=0;i<n;i++) {
		h[i] = sc.nextInt();
	}
	Arrays.sort(h,  Collections.reverseOrder());

	try {
		for(int i=0;i<k;i++) {
			h[i] = 0;
		}
	}
	catch(Exception e) {}
	finally{
		for(int i=0;i<n;i++) {
			count += h[i];
		}
	}
	System.out.println(count);
  }
}