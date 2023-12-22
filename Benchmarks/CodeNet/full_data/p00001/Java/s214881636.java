import java.util.*;
class Main {
	public static void main(String[] a){
		Scanner sc  = new Scanner(System.in);
		TreeSet<Integer> tree = new TreeSet<Integer>();
		while(sc.hasNextInt()) {
			tree.add(sc.nextInt());
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(tree.pollLast());
		}
	}
}