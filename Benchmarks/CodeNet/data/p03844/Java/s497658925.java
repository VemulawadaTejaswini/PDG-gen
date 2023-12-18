import java.util.*;
public class Main {
	public static void main(String[] args){
		int x, y;
		String s;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		s = sc.next();
		y = sc.nextInt();
		//System.out.println(x + s + y);
		
		if(s.equals("+")){
			System.out.println(x+y);
		}else{
			System.out.println(x-y);
		}
	}
}
