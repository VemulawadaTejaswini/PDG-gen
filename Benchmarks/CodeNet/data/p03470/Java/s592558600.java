import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
			hs.add(scan.nextInt());
		}
		System.out.println(hs.size());
	}
}