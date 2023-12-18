package atcoder079_b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt()+1;
		sc.close();
		long ruka[] = new long[x];
		ruka[0]=2;
		if(x>0)
			ruka[1]=1;

		for(int i=2;i<x;i++) {
			ruka[i]=ruka[i-1]+ruka[i-2];
		}

		System.out.print(ruka[x-1]);
	}


}
