import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		Number[] number = new Number[Q];
		Main main = new Main();
		for (int i=0;i<Q;i++) {
			Number temp = main.new Number();
			temp.a = sc.nextInt();
			temp.b = sc.nextInt();
			temp.c = sc.nextInt();
			temp.d = sc.nextInt();
			number[i] = temp;
		}
		int select[] = new int[N];
		for (int i=0;i<N;i++) {
			select[i] =1;
		}
		int max=0;
		int sum =0;
		while (true) {
			sum =0;
			for(int i=0;i<Q;i++) {
				if(select[number[i].b-1]-select[number[i].a-1]==number[i].c) {
					sum +=number[i].d;
				}
			}
			if (max<sum) {
				max =sum;
			}
			if(main.nextSelect(select, N,M)==false) {
				break;
			}
		}
		System.out.println(max);
	}
	public int doNext(int [] select ,int N ,int M) {
		int n = N-1;
		while (n>=0&&select[n]==M) {
			n--;
		}
		if (n==-1) {
			return 0;
		}
		select[n]+=1;
		for (int i=n+1;i<N;i++) {
			select[i]=select[n];
		}
//		for (int i=0;i<N;i++) {
//			System.out.print(select[i]);
//		}
//		System.out.println();
		return 1;
	}
	public boolean nextSelect(int[] select,int N,int M) {
		int n =N-1;
		while (true) {
			int returnValue = doNext(select,N,M);
			if (returnValue==0) {
				return false;
			}
			if (returnValue==1) {
				return true;
			}
		}
	}
	public class Number {
		public int a;
		public int b;
		public int c;
		public int d;

	}
}