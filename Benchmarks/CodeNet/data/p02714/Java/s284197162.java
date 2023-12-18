import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int N = scanner.nextInt();
	 	String S = scanner.next();
	 	int count = 0;
 		String[] numArray = S.split("");
 		for (int i = 0; i < N-2; i++) {
 			for (int j = i+1; j < N-1; j++) {
 				if (!(numArray[i].equals(numArray[j]))) {
 					for(int k = j+1; k < N; k++) {
 						if (!(numArray[k].equals(numArray[j])) && !(numArray[k].equals(numArray[i]))) {
 							int x = j - i;
 							if (k - j != x) {
 								count += 1;
 							}
 						}
 					}
 				}
 			}
 		}
 		System.out.println(count);
	}
}
