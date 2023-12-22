
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int q1 = sc.nextInt();
			if(q1 == 0) break;
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			
			int i,j=0;
			for(i=q2;i>0;i--) {
//				System.out.println(c1*i + " " + b);
				if( b<c1*i ) continue;
				int zan = b-c1*i;
				j = zan/c2;
				if(i+j >= q1) break;
			}
			
			if( i!=0 ) System.out.println(i + " " + j);
			else System.out.println("NA");
			
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}