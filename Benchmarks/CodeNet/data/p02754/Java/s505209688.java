import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long b = in.nextLong();
		long r = in.nextLong();
		long bl =0;
		while(n>0){
			if(n>b){
				bl+=b;
			}
			else{
				bl+=n;
			}
			n = n-(b+r);
		}
		System.out.print(bl);
	}
}