import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == '0' ^ i % 2 == 0) {
		        countA++;
		    } else {
		        countB++;
		    }
		}
		System.out.println(Math.min(countA, countB));
	}
}
