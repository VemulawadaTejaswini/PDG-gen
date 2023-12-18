import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();

		int answer=1;

		for(int i=2;i<x;i++) {
			answer=Math.max(answer, bekijou(i, x));
		}

		System.out.print(answer);
	}

	public static int bekijou(int b, int x) {

		int i=b;
		while(i*b<=x) {
			i=i*b;
		}
		if(i!=b) {
			return i;
		}
		else {
			return 0;
		}


	}

}
