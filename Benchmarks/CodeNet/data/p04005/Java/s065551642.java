import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		System.out.println(a * b * c % 2 == 0 ? 0 : Math.min(a, b) * Math.min(Math.max(a, b), c));
	}
}
