

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int result = 0;
		
		int n = scan.nextInt();
		Integer[] ary = new Integer[n];
		
		for(int i=0;i<n;i++) {
			ary[i] = scan.nextInt();
		}
		
		Arrays.sort(ary, Comparator.reverseOrder());;
		
		for(int i=0;i<ary.length-1;i++) {
			
			for(int j=i+1;j<ary.length;j++) {
				if(ary[i] % ary[j] == 0) {
					num++;
					break;
				}
			}
			
			if(num < 1) {
				result++;
			}
			num=0;
				
		}
		
		System.out.println(result+1);
	}

}
