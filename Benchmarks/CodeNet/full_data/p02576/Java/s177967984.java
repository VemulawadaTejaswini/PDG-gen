import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		System.out.println(n / x % t == 0 ? n / x * t : (n / x + 1) * t);
	}
}
