package problemB;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		long ans = sc.nextLong();
		for (int i = 1; i < num; i++) {
			ans = ans * sc.nextLong();
		}
		long ser = ans;
		int j = 0;
		while(j<18) {
			ans = ans/10;
			j = j + 1;
		}
		
		if (ans>=1){
		System.out.println(-1);
		}else {
			System.out.println(ser);
		}
		sc.close();
	}// main
}
// class