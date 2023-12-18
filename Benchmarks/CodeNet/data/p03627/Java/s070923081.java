import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] rodInfo = new Integer[n];
		for(int i =0;i < n;i++) {
			rodInfo[i] = sc.nextInt();
		}
		Arrays.sort(rodInfo,Collections.reverseOrder());

		int longRod = 0;
		int shortRod = 0;
		for(int i =1;i < n;i++) {
			if(rodInfo[i].equals(rodInfo[i-1])) {
				if(longRod ==0) {
					longRod = rodInfo[i];
				}else {
					shortRod = rodInfo[i];
				}
				i++;
			}
			if(longRod != 0 && shortRod !=0) {
				break;
			}
		}
		System.out.println(longRod * shortRod);
	}
}