import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		long Count = 0l;
		for(int i = 0; i < N; i++) {
			int ch = sc.nextInt();
			list.add(ch);
			Optional<Integer> mi = list.stream().min((a,b) -> a.compare(a, b));
			int min = mi.get();
			if(ch <= min)Count++;
		}
		System.out.println(Count);
	}	
}