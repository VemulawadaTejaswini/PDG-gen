import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String K = scanner.next();
		long resultLong=0; 
		long number = 0;
		while(resultLong<K) {
			number++;
			long N=0;
			for(int i=0; i<K.length(); i++) {
				N = N + Integer.parseInt(s.charAt(i)+"");
			}
			if(number/N<=1) {
				System.out.println(number);
				resultLong++;
			}
		}

	}
}
