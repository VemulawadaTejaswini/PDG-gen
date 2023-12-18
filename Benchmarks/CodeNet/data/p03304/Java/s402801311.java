import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		long D=sc.nextLong();
      	double kakuritu=0;
		if(D==0) {
			kakuritu=1.0/N*(M-1);
		}
		else {
			kakuritu=(2*(double)(N-D))/(N*N)*(M-1);
		}
      pl(kakuritu);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
}
