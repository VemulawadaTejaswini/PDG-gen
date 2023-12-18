import java.util.*;
// . >
class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		// String a = in.nextLine();
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		Set<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		// 125
		// 12 5
		// 1 25
		// 1 2 5
		// 125
		// 
		System.out.println(set.size());
		
	}

}
