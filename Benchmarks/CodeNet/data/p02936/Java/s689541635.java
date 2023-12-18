import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.next());
		int q =Integer.parseInt(sc.next());

		ki anski = new ki(n);
		for(int i=0 ; i < n -1; i++) {
			anski.setBranch(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		for(int i = 0 ; i < q ; i++) {
			anski.setValue(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}

		anski.add();

		for(int ans: anski.getAns()) {
			System.out.println(ans + " ") ;
		}

	}
}

class ki{
	int ans[];
	List<HashSet<Integer>> branch;


	public ki(int n) {
		ans = new int[n];
		branch = new ArrayList<HashSet<Integer>>();
		for (int i = 0 ; i < n ; i++) {
			ans[i] = -0;
			branch.add(new HashSet<Integer>());
		}
	}

	public void setBranch(int a,int b) {
			branch.get(a -1).add(b);
			branch.get(b -1).add(a);
	}


	public void setValue(int number,int value) {
		ans[number -1] += value;
	}

	public int[] getAns() {
		return ans;
	}
  
     public void add() {
		for(int i :branch.get(0)) {
			add(1,i);
		}

	}

	public void add(int root,int target) {
        ans[target - 1] += ans[root -1];
        for(int i : branch.get(target -1)) {
        	if(i == root) continue ;
        	add(target,i);
        }

	}
}
