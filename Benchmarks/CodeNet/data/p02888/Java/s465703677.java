
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lengthes = new int[n + 1];
		for(int i = 0; i < n; i++){
			lengthes[i] = sc.nextInt();
		}
		lengthes[n] = Integer.MAX_VALUE;
		Arrays.sort(lengthes);
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int k = i + 1; k < n; k++){
				int twoLength = lengthes[i] + lengthes[k];
				int begin = k;
				int end = n;
				while(end - begin > 1){
					int middle = (begin + end) / 2;
					if(lengthes[middle] < twoLength){
						begin = middle;
					}else{
						end = middle;
					}
				}
				count += begin - k;
			}
		}
		System.out.println(count);
	}
}
