import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		int flag=0;
		loop: for (int a=0;a<N+1;a++) {
			for (int b=0;b<N+1;b++) {
				for (int c=0;c<N+1;c++) {
					if (10000*a+5000*b+1000*c==Y && a+b+c==N) {
						System.out.println(a+" "+b+" "+c);
						flag=1;
						break loop;
					}
				}
			}
		}

		if(flag==0) {
			System.out.println((-1)+" "+(-1)+" "+(-1));
		}
	}
}