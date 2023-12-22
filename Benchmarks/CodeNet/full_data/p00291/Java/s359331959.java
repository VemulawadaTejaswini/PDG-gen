import java.util.*;

import javax.xml.crypto.Data;

import java.math.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[] {1,5,10,50,100,500};
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += sc.nextInt() * a[i];
		}
		System.out.println((sum >= 1000)?"1":"0");
		
	}
	
}