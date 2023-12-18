import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int k = sc.nextInt();
		 int n = sc.nextInt();
		 int iBefore = sc.nextInt();
		 int max = Integer.MIN_VALUE;
		 int in = 0;
		 for (int j = 1; j<n ; j++) {
			in = sc.nextInt();
			max = Math.max(max,in - iBefore);
		 }
		 System.out.println(k - Math.max(max,k - in));
	}
}