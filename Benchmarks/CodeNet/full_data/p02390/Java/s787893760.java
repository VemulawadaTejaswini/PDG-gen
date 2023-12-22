import java.util.*;

public class Main{
	public static void main(String[] args){
		int h, m, s;
		
		Scanner c = new Scanner(System.in);
		int b = c.nextInt();
		
		h = b / 3600;
		m = (b % 3600) / 60;
		s = (b % 3600) % 60;
		
		System.out.println(h +":"+ m +":"+ s);
	}
}