import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int num[] = new int[8];
		String temp;
		for(int i = 0; i < time; i++){
			temp = sc.next();
			for(int k = 0; k< 8; k++){
				num[k] = Integer.valueOf(temp.substring(k,k+1));
			}
			Arrays.sort(num);
			int c = 1;
			int min = 0;
			int max = 0;
			for(int x = 0; x < 8;x++){
				max = max + num[x] * c;	
				min = min + num[7-x] * c;
				c = c * 10;
			}
			//System.out.println("max is " + max);
			//System.out.println("min is " + min);
			System.out.println(max - min);
			
		}
	}
}