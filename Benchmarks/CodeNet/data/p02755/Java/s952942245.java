import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		for(int i=1; i<=100000; i++) {
			if( i*2/25 == A && i*1/10 == B) {
				pl(i);
				System.exit(0);
			}
		}
		pl(-1);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}

}