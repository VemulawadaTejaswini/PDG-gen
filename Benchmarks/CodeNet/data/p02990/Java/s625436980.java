import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long BIG_VALUE = 1000000007;
		Map<Long, Long> cash = new HashMap<>();

		ArrayList<Integer> kHikuI = getList(k-1);
		ArrayList<Integer> nHikuK = getList(n-k);
		for (int i = 1; i <= k; i++) {
			int redlessNum = Math.min(n-k-i, i);
			redlessNum = redlessNum<0
				?0
				:redlessNum;
			int redNum = getCombination(nHikuK, redlessNum);
			// System.out.println("redNum " + redNum);

			int blueLessNum =  Math.min(k-i, i-1);
			blueLessNum = blueLessNum < 0 
				? 0 
				: blueLessNum;
			int blueNum = getCombination(kHikuI, blueLessNum);
			// System.out.println("blueNum " + blueNum);
			long result = redNum*blueNum;
			result = result%BIG_VALUE;
            System.out.println(result);
            // System.out.println();
		}

	}

	private static ArrayList<Integer> getList(int count){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			list.add(i);
		}
		return list;
	}

	
	private static int getCombination(ArrayList<Integer> n, Integer r) {
		if(r==0){
			return 1;
		}
        Set<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();
        combination(n, r, ans);
        for (ArrayList<Integer> e : ans) {
            // System.out.println(e.toString());
        }
        return ans.size();
    }

    private static void combination(ArrayList<Integer> n, Integer r, Set<ArrayList<Integer>> ans) {
        if (n.size() == r) {
            ans.add(n);
            return;
        }
        for (int i = 0; i < n.size(); i++) {
            ArrayList<Integer> N = new ArrayList<Integer>();
            N.addAll(n);
            N.remove(i);
            combination(N,r,ans);
        }
    }

}
