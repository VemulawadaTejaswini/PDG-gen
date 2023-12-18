import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> x=new ArrayList<>();
		boolean can = true;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			if(!x.contains(m)) {
				x.add(m);
			}else {
				can = false;
				break;
			}
		}
		String s = can?"YES":"NO";
		System.out.println(s);
	}
}
