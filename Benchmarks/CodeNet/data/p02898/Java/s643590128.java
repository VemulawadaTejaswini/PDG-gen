package contest;

import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		int n;
		int K;
		int res = 0;
		try(Scanner sc = new Scanner(System.in)){
			n = sc.nextInt();
			K = sc.nextInt();
			for(int i=0; i < n;i++) {
				int h = sc.nextInt();
				if(h>=K) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
}
