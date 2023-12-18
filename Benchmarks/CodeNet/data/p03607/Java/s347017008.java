import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int n = in.nextInt();
		int memo = 0;
		for (int i = 0; i < n; i++) {
			memo = in.nextInt();
			if (array.contains(memo)) {
				array.remove(array.indexOf(memo));
			}else{
				array.add(memo);
			}
		}
		System.out.println(array.size());
	}
}