import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		for(long v=1;v<=100000;++v) {
			if(v*8/100==A&&v*10/100==B) {
				System.out.println(v);
				return;
			}
		}
		System.out.println(-1);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
