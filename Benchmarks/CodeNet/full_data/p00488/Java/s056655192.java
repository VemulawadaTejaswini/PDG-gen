package java_kadai_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[2];
		for(int i=0;i<3;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++){
			b[i] = sc.nextInt();
		}
		int c=2000,d = 2000;
		for(int i=0; i<3;i++){
			if(a[i]<c){
				c = a[i];
			}
		}
		for(int i=0; i<2;i++){
			if(b[i]<d){
				d = b[i];
			}
		}
		
		
		System.out.printf("%d", c+d-50);
	}
}