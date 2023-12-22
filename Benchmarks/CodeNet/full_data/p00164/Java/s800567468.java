
import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int x[] = {31,26,21,16,11,6,1};
		for(;;){
			int n = sc.nextInt();
		      
			if(n == 0){
				break;
			}
					
			int a[] = new int[n];
			
			for(int i = 0 ; i < n ; i++){
				a[i] = sc.nextInt();
			}
			int p = 0;
			for(int i = 0 ; i < 7;i++){
				p %= n;
				System.out.println(x[i]);
				int c = x[i]-a[p];
				System.out.println(Math.max(c, 0));
				p++;
			}
			
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}