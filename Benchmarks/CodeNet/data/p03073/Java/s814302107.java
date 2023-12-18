import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (i % 2 == 0 ^ arr[i] == '0') {
		        count++;
		    }
		}
		System.out.println(Math.min(count, arr.length - count));
   }
}
