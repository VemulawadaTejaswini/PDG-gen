import java.util.*;

public class ITP1_1D{
	public static void main(String[] args){
		
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		
		int h, m, s;
		
		h = a / 3600;
		m = (a % 3600) / 60;
		s = (a % 3600) % 60;
		System.out.println(h+":"+m+":"+s);
	}
}