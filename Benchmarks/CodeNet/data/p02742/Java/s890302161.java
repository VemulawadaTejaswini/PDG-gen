import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long r = H*W;
		r = r/2;
		if(H%2!=0 && W%2!=0) {
			r++;
		}
		if(H == 1 || W == 1) {
			r = 1;
		}
		System.out.println(r);
	}	
}