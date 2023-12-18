import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long min = Integer.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			min = Math.min(min, sc.nextLong());
		}
		System.out.println((N + min - (long)1) / min + (long)4);
	}
}
