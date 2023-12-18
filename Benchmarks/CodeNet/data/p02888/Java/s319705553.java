
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int k = i + 1; k < n; k++){
				for(int l = k + 1; l < n; l++){
					int[] tryangle = new int[3];
					tryangle[0] = ary[i];
					tryangle[1] = ary[k];
					tryangle[2] = ary[l];
					Arrays.sort(tryangle);
					if(tryangle[2] < tryangle[0] + tryangle[1]){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
