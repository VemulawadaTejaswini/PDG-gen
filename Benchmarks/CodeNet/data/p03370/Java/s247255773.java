import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] m = new int[n];
		Arrays.setAll(m, i -> Integer.parseInt(sc.next()));
		int sum = Arrays.stream(m).sum();
		Arrays.sort(m);
		System.out.println(n + (x - sum) / m[0]);
	}
}
