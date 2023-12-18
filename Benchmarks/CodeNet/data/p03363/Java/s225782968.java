import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	for (int i = 0; i < n; i++) {
        	a[i] = Integer.parseInt(sc.next());
        }
      
      	int sumCnt = 0;
      	int sum = 0;
		for (int i = 0; i < n - 1; i++) {
          	sum = a[i];
        	for (int j = i + 1; j < n; j++) {
            	sum += a[j];
              	if (sum == 0) { sumCnt++; }
            }
        }
      	
      	System.out.println(sumCnt);
    }
}