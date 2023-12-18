import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int L;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		List<Integer> list_1 =new ArrayList<Integer>();
		List<Integer> list_2 =new ArrayList<Integer>();
		for(int n=0;n<N;) {
			list_1.add(sc.nextInt());
			list_2.add(n+1);
		}
		for(int m=0;m<M;m++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(list_1.get(a)<list_1.get(b)) {
				list_2.set(a, 0);
			}
			else {
				list_2.set(b, 0);
			}
		}
		list_2=new ArrayList<Integer>(new HashSet<>(list_2));
		L=list_2.size();
		L=L-1;
		System.out.println(L);
	}
}
