import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b = sc.next();
        String s = b.substring(0,1)+b.substring(2,4);
        int c = Integer.parseInt(s);
        long d = a*c;
		System.out.println(d/100);
	}
}