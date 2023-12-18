import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static long K;
	static int a;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		List<Integer> list_1 =new ArrayList<Integer>();
		N=sc.nextInt();
		K=sc.nextLong();
		for(int n=0;n<N;n++) {
			list_1.add(sc.nextInt());
		}
		for(long m=0;m<K;m++) {
			a=list_1.get(a);
			a=a-1;
		}
		System.out.println(a+1);
	}
}