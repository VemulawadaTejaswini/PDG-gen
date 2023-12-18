import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		
		if(list.contains(1) && list.contains(9) && list.contains(7) && list.contains(4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
