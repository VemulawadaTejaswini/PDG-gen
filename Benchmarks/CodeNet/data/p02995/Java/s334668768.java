import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		System.out.println(B-A+1 -(B/C-(A-1)/C+B/D-(A-1)/D-B/lcm(C,D)+(A-1)/lcm(C,D)));
	}
	static long gcd(long C,long D){
		long dai=Math.max(C,D);
		long shou=Math.min(C,D);
		long amari=dai%shou;
		while(amari!=0){
			dai=shou;
			shou=amari;
			amari=dai%shou;
		}
		return shou;
	}
	static long lcm(long C,long D){
		return C*D/gcd(C,D);
	}
}


