import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long res=0;
		if (b-a ==0) {
			res =0;;
		}
		else {
			res = (b-a)/x;		
		if (b%x==0) {
			res++;}}
		
		System.out.println(res);
	}

}
