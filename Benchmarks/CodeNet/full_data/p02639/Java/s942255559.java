

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] ary = new int[5];
		int a = 0;
		
		for(int i=0;i<ary.length;i++) {
			ary[i] = scan.nextInt();
			
			if(ary[i] == 0) {
				a = i;
			}
		}
		
		System.out.println(a+1);
	}

}
