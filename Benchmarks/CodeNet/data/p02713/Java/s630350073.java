import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int count = 0;
		for (int a = 1; a <= K; a++) {
			for (int b = 1; b <= K; b++) {
				 for (int c = 1; c <= K; c++) {
					 int min = c;
					 if (b < c) min = b;
					 if (a < b) min = a;
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