import java.util.Scanner;

public class Main {
	
	public int search(int[] s, int value) {
		int left = 0;
		int right = s.length - 1;
		while( left <= right) {
			int med = (left+right) / 2;
			
			if(value == s[med]) {
				return 1;
			}
			if(value < s[med]) {
				right = med - 1;
			}
			else {
				left = med + 1;
			}
		}
		return 0;
	}
	
	
//	public boolean prime(int x) {
//		
//		if(x < 2) {
//			return false;
//		}
//		if(x == 2) {
//			return true;
//		}
//		for(int i = 2; i <= Math.sqrt(x); i++) {
//			if(x % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main program = new Main();
		int results = 0;
		//System.out.println("enter");
		
		int ssize = in.nextInt();
		int[] s = new int[ssize];
		for(int i= 0; i < ssize; i++) {
			s[i] = in.nextInt();
		}
		
		int tsize = in.nextInt();
		int[] t = new int[tsize];
		for(int i = 0; i < tsize; i++) {
			t[i] = in.nextInt();
		}
		
		for(int i =0; i < tsize; i++) {
			if((program.search(s, t[i])) == 1){
				results++;
			}
		}
		
		System.out.println(results);
		
//		for(int i = 0; i < size; i++) {
//			int value = in.nextInt();
//			if(program.prime(value) == true) {
//				results++;
//			}
//		}
//		System.out.println(results);
	}
}

