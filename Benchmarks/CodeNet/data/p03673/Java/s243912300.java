import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		LinkedList<Integer> ans = new LinkedList<Integer>();
		for (int i=0; i<n; i++){
			if (i%2 == 1){
				ans.add(Integer.parseInt(sc.next()));
			}else {
				ans.add(0, Integer.parseInt(sc.next()));
			}
		}

		if (n%2 == 0){
			Collections.reverse(ans);
		}
//		System.out.println(ans);

		for(int elem : ans.subList(0, ans.size()-1)){
			System.out.print(elem + " ");
		}
		System.out.println(ans.get(ans.size()-1));
	}
}
