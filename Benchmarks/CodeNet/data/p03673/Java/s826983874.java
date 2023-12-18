import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i=0; i<n; i++){
			ans.add(Integer.parseInt(sc.next()));
			Collections.reverse(ans);
		}

		for(int elem : ans.subList(0, ans.size()-2)){
			System.out.print(elem + " ");
		}
		System.out.println(ans.get(ans.size()-1));
	}
}
