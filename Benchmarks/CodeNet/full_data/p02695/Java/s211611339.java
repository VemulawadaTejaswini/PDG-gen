import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int m =  Integer.parseInt(sc.next());
		int q =  Integer.parseInt(sc.next());
		
		int[][] a = new int[q][4];
		for(int i = 0 ; i < q ; i++) {
			a[i][0] = Integer.parseInt(sc.next());
			a[i][1] = Integer.parseInt(sc.next());
			a[i][2] = Integer.parseInt(sc.next());
			a[i][3] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		List<Integer> temp = new ArrayList<Integer>();
		for(int i = 1 ; i <= m ; i++) {
			temp.add(i);
		}
		List<List<Integer>> lists = Combination1.make(temp, n);
		
		for(List<Integer> list : lists) {
			int sum = 0;
			for(int i = 0; i < q ; i++) {
				if((list.get(a[i][1]-1))  - (list.get(a[i][0]-1)) == a[i][2]) {
					sum += a[i][3];
				}
			}
			ans = Math.max(ans, sum);
		}
		
		System.out.println(ans);
	}

	
}


class Combination1 {
    public static List<List<Integer>> make (List<Integer> candidate, int r) {
        if (candidate.size() < r || candidate.size() <= 0 || r <= 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }

        List<List<Integer>> combination = new ArrayList<>();
        for (int i = 0; i <= candidate.size() - r; i++) {
            Integer picked = candidate.get(i);
            List<Integer> rest = new ArrayList<>(candidate);
            rest.subList(0, i + 1).clear();
            combination.addAll(make(rest, r - 1).stream().map(list -> {
                list.add(0, picked);
                return list;
            }).collect(Collectors.toList()));
        }
        return combination;
    }
}