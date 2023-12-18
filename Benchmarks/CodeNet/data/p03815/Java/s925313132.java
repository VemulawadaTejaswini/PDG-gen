import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		long x=s.nextLong(),count=0;
		count+=(x/11)*2;
		x%=11;
		if(x==0) {
			System.out.println(count);
		}else if (x<=5) {
			System.out.println(count+1);
		}else {
			System.out.println(count+2);
		}
	}
}
