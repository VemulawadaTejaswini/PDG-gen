import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = 100;
		long ans=0;
		
		while (Y<X) {
			Y=(long) (Y*1.01);
			ans=ans+1;
		}
		System.out.println(ans);
    }
}