import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	int[] t = new int[n];
      	for (int i = 0; i < n; i++) {
        	t[i] = Integer.parseInt(sc.next());
        }
      	int m = Integer.parseInt(sc.next());
		for (int i = 0; i < m; i++) {
          	int cnt = 0;
        	int p = Integer.parseInt(sc.next());
          	int x = Integer.parseInt(sc.next());
			for (int j = 0; j < n; j++) {
            	if (p == j + 1) {
                	cnt += x;
                } else {
                	cnt += t[j];
                }
            }
          	System.out.println(cnt);
        }
    }
}
