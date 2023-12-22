import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n600 = 600;
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int d = scan.nextInt();
			int ans = 0;
			for(int x = d; x < n600; x += d){
				ans += d * (x*x);
			}
			list.add(ans);
		}

		for(int n : list){
			System.out.printf("%d\n", n);
		}
	}
}