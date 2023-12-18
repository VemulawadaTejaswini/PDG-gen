import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		Map<String, Integer> store = new HashMap<>();
		store.put(s , input.nextInt());
		store.put(t , input.nextInt());
		String remove = input.next();
		store.put(remove , store.getOrDefault(remove, 0) - 1);
		System.out.println(store.getOrDefault(s , 0) + " " + store.getOrDefault(t, 0));
		input.close();
	}

}
