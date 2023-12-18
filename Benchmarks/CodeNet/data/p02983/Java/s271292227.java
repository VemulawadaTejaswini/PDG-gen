package sd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),a2=in.nextInt();
		int min=Integer.MAX_VALUE;
		for (int i = a; i <a2; i++) {
			for (int j = i+1; j <a2; j++) {
				int sum=(i*j)%2019;
				if(min>sum){
					min=sum;
				}
			}
		}
		System.out.println(min);
	}
}
