import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = str.length();
		char[] arr = new char[n];
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'P') {
				arr[i] = 'P';
			} else {
				arr[i] = 'D';
			}
		}
		System.out.println(new String(arr));

	}
	
	

}
