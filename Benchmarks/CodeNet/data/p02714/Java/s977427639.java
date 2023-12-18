import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int N = scanner.nextInt();
	 	String S = scanner.next();
	 	int count = 0;
 		String[] sArray = S.split("");
 		int[] numArray = new int[N];
 		for (int i = 0; i < N; i++) {
 			if (sArray[i].equals("R")) {
 				numArray[i] = 0;
 			} else if (sArray[i].equals("G")) {
 				numArray[i] = 1;
 			} else {
 				numArray[i] = 2;
 			}
 		}
 		for (int i = 0; i < N-2; i++) {
 			for (int j = i+1; j < N-1; j++) {
 				if (numArray[i] != numArray[j]) {
 					for(int k = j+1; k < N; k++) {
 						if (numArray[k] != numArray[j] && numArray[k] != numArray[i]) {
 							int x = j - i;
 							if (k - j != x) {
 								count += 1;
 								//System.out.println(i + "," + j + "," + k);
 							}
 						}
 					}
 				}
 			}
 		}
 		System.out.println(count);
	}
}
