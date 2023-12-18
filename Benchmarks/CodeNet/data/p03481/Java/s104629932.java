import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong(),y=sc.nextLong(),count=1;
		for(long i=1;i<Long.MAX_VALUE;i++) {
			if(x*Math.pow(2, i)>y) {
				break;
			}
			//System.out.println(x*i*2);
			count++;
		}
		System.out.println(count);
	}
}
