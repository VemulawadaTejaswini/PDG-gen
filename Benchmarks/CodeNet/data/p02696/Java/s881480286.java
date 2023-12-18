import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();       
		long c = sc.nextLong();
        long ans = 0;
        if(b>c){ans = (a*c)/b;}
        else{ans = (a*(b-1))/b;}
		System.out.println(ans);
	}
}
