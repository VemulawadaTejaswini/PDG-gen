
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Taichi1 on 10/22/16.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		while (sc.hasNext()) {
			set.add(sc.nextInt());
		}
		System.out.println(set.size());
	}
}