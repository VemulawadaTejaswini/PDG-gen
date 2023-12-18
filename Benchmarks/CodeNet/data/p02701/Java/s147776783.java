import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Set<String> set = new HashSet<String>();
		for(int i =0 ; i < n;i++) {
			set.add(sc.nextLine());
		}
		System.out.println(set.size());
	}

}
