import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, ans = 0;
		List<Integer> a = new ArrayList<Integer>();
		
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			if(a.contains((Integer)tmp))
				a.remove((Integer)tmp);
			else
				a.add(tmp);
		}
		ans = a.size();
		sc.close();
			System.out.println(ans);
	}

}
