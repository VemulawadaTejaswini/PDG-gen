import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		hmap.put(sc.nextInt(), 1);
		hmap.put(sc.nextInt(), 1);
		hmap.put(sc.nextInt(), 1);
		
		System.out.println(hmap.size());

		
	}
	

}
