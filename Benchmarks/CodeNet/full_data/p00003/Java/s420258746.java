package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class CodeTest {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for(int i=0;i<n;i++){
			int[] num = new int[3];
			for(int j=0;j<3;j++){
				num[j] = sc.nextInt();
			}
			Arrays.sort(num);
			if(num[0]*num[0]+num[1]*num[1]==num[2]*num[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}