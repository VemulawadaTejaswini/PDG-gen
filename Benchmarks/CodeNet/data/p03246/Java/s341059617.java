import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer,Integer> o=new HashMap<>();
		Map<Integer,Integer> e=new HashMap<>();
		o.put(0,0);
		e.put(0,0);

		for(int i = 0;i < n;i++)
			(i%2==0 ? e : o).merge(sc.nextInt(),1,Integer::sum);
		sc.close();

		Comparator<Entry<Integer,Integer>> comp = Entry.comparingByValue();
		Entry<Integer,Integer> O = o.entrySet().stream()
				.max(comp)
				.get();
		Entry<Integer,Integer> E = e.entrySet().stream()
				.max(comp)
				.get();
		o.remove(O.getKey());
		e.remove(E.getKey());
		Entry<Integer,Integer> O2=o.entrySet().stream()
				.max(comp)
				.get();
		Entry<Integer,Integer> E2=e.entrySet().stream()
				.max(comp)
				.get();
		n -= O.getKey().equals(E.getKey())
				? Math.max(O.getValue()+E2.getValue(),
						E.getValue()+O2.getValue())
				: O.getValue()+E.getValue();
		System.out.println(n);
	}
}