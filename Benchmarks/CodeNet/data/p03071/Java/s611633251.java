import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		int x1 = A + A -1;
		int x2 = A + B ;
		int x3 = B + B -1;
		int r1 = (x1 > x2)? x1: x2;
		int ret = r1 > x3? r1 : x3;

		System.out.println(ret);

	}
}
