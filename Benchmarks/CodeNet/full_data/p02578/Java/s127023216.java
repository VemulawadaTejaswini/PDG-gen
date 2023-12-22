import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	//2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		int count = 0;
		int len = 0;
		for (int i = 0; i < ar.length-1; i++) {
			if (ar[i]>ar[i+1]) {
				count++;
				len = i+1;
			}
		}
		if (ar.length-1==len) {
			System.out.println(count+1);
		}else {
			System.out.println(count);
		}
		
	}
	

}