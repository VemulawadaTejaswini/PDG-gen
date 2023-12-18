import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int count = 0;
		for (int a = 1; a <= K; a++) {
			int min = a;
			for (int b = 1; b <= K; b++) {
				if (b <= a) min = b;
				 for (int c = 1; c <= K; c++) {
					 if (c <= b) min = c;
					 int com = 0;
					 for (int i = min; 1 <= i ; i--) {
						 if (a%i == 0 && b%i == 0 && c%i == 0) {
							 com = i;
							 break;
						 }
					 }
					 count += com;
				 }
			}
		}
		System.out.println(count);
	}
}