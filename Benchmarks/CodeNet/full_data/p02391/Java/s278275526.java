import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int	a = Integer.parseInt(s.next()),
			b = Integer.parseInt(s.next());
		if(a>b)
			System.out.println("a > b");
		else if(a<b)
			System.out.println("a < b");
		else
			System.out.println("a == b");
	}
}