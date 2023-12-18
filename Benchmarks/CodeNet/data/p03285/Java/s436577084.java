//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			if(N%4==0||N%7==0||N%11==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		
	}
}