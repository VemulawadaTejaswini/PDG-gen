import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> s = new HashSet<String>();
		sc.nextLine();
		while(n-- > 0){
			s.add(sc.nextLine());
		}
		System.out.println(s.size());
	}
}
