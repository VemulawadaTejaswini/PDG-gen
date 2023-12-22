import java.util.*;
class ProblemA{
	public static void main(String[] a){
		Scanner sc  = new Scanner(System.in);
		TreeSet tree = new TreeSet();
		while(sc.hasNextInt()) {
			tree.add(sc.nextInt());
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(tree.pollLast()); i++;
		}
	}
}