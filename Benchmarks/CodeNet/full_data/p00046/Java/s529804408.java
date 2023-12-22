import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		ArrayList<Double> al = new ArrayList<Double>();
		while(sc.hasNext()) {
			al.add(sc.nextDouble());
		}
		System.out.println(Collections.max(al) - Collections.min(al));
	}
}