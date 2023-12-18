import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> d = new HashSet<>();
		for (int i = 0; i < N; i++) d.add(sc.nextInt());
		System.out.println(d.size());
	}
}