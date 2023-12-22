
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int len[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			len[i] = sc.nextInt();
		}
		
		int count = 0;
		int tmpArray[] = new int[3];
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					tmpArray[0] = len[i];
					tmpArray[1] = len[j];
					tmpArray[2] = len[k];
					
					Arrays.sort(tmpArray);
					
					if(tmpArray[0] != tmpArray[1] && 
							tmpArray[1] != tmpArray[2] && 
							tmpArray[0] + tmpArray[1] > tmpArray[2]) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
