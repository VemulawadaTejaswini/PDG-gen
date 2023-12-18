
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msg = "No";
		int N = sc.nextInt();
		int array[] = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				count++;
				continue;
			}
			for (int j = i - 1; j >= 0; j--) {
				if (array[i] < array[j]) {
					break;
			} else if(j == 0) {
						count++;
				}
			}
		}
		
		
		System.out.println(count);
	}
}