import java.util.*;

public class Main {
	public static void main(String[] args){
		int S,h,m,s;
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		
		h = S / 3600;
		m = (S % 3600) / 60;
		s = (S % 3600) % 60;
		
		System.out.println(h+":"+m+":"+s);
	}
}