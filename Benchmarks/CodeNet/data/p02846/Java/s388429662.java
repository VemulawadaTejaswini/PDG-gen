import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long t1 = sc.nextLong();
		long t2 = sc.nextLong();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong() - a1;
		long b2 = sc.nextLong() - a2;
		
		b1 *= t1;
		b2 *= t2;
		long diff = b1 + b2;
		
		if (diff == 0){
			System.out.print("infinity");
			return;
		}
		
		if ((Math.signum(b1) * Math.signum(b2)) >= 0){
			System.out.print("0");
			return;
		}
		
		if (Math.abs(b1) > Math.abs(b2) ){
			System.out.print("0");
			return;
		}
		
		if (Math.abs(b1) > Math.abs(b2) ){
			System.out.print("0");
			return;
		}
		//System.out.print((int)Math.ceil((double)Math.abs(b1) / Math.abs(diff)));
		System.out.print(1 +(long)Math.floor((double)Math.abs(b1) / Math.abs(diff))*2);
	}
}