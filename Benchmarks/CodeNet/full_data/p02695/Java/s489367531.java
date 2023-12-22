import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	Set<String> set = new HashSet<String>();
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
//		StringBuffer sb =new StringBuffer();
//		for (int i=1;i<N;i++) {
//			sb.append(select[i]-select[i-1]);
//		}
//		if (set.contains(sb.toString())==false) {
//			set.add(sb.toString());
//			return 1;
//		} else {
//			return -1;
//		}
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