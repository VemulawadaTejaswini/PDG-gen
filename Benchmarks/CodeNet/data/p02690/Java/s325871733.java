import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long target = sc.nextLong();

		//		long l =100000*100000;
		//		System.out.println(l);
		HashSet<Integer>A=new HashSet<Integer>();
		HashSet<Integer>B=new HashSet<Integer>();
		for(int i =-1;i<100000;i++) {
			A.add(i);
			B.add(i);
		}

		for (long i:A) {
			for (long j:B) {
				long tmp = (i * i * i * i * i) - (j * j * j * j * j);
				if (tmp == target) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}

		System.out.println();

	}
}
