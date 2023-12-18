import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Long K=sc.nextLong();
		int A[]=new int[N];
		int place=1;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		long i=K;
		while(i>0l) {
			place=A[place-1];
			i--;
		}
		System.out.println(place);
	}
}
