import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[sc.nextInt()];
		sc.next();
		Arrays.setAll(s, i -> sc.next());
		Arrays.stream(s).sorted().forEach(System.out::print);
		System.out.println();
	}
}
