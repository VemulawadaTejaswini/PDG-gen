import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X,N;
		X=sc.nextInt();
		N=sc.nextInt();

		int syoki_hairetu[] = new int[201];
		for(int i=0;i<201;i++) {
			syoki_hairetu[i]=-100+i;
		}


		int p[]=new int[N];
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
			syoki_hairetu[100+p[i]]=-101;
		}

		int tmp;
		int min_abs=X;
		int min_number=X;

		for(int i=0;i<201;i++) {
			tmp=Math.abs(X-syoki_hairetu[i]);
			if(tmp<min_abs) {
				min_abs=tmp;
				min_number=syoki_hairetu[i];
			}
		}
		System.out.println(min_number);
		/*for(int i=0;i<201;i++) {
			System.out.print(syoki_hairetu[i]+" ");

		}*/
	}
}
