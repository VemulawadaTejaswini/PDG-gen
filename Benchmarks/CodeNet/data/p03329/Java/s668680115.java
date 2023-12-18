import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int[] a = {59049, 46656, 7776, 6561, 1296, 729, 216, 81, 36, 9, 6, 1};
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			count += N/a[i];
			N = N%a[i];
			System.out.println(i + ", " + count);
		}
		
		
		System.out.print(count);
		in.close();
		
	}
}