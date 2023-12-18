import java.util.*;
public class Main {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++)
			a.add(sc.nextInt());
		HashSet<Integer> h=new HashSet<>(a);
		if((a.size()-h.size())%2==0)System.out.println(h.size());
		else System.out.println(h.size()-1);
		sc.close();
	}
}