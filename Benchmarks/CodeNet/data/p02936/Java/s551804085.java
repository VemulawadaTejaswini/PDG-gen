import java.util.ArrayList;
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
	List<Integer> branch[];


	public ki(int n) {
		ans = new int[n];
		branch = new ArrayList[n];
		for (int i = 0 ; i < n ; i++) {
			ans[i] = -1;
			branch[i] = new ArrayList<Integer>();
		}
		ans[0] = 0;
	}

	public void setBranch(int number,int value) {
		if(ans[number -1] != -1) {
			branch[number -1].add(value);
			ans[value -1] = 0;
		}else {
			branch[value -1].add(number);
			ans[number -1] = 0;
		}
	}


	public void setValue(int number,int value) {
		ans[number -1] += value;
	}

	public int[] getAns() {
		return ans;
	}
  
     public void add() {
		for(int i :branch[0]) {
			add(1,i);
		}

	}

	public void add(int numvber,int target) {

        ans[target - 1] += ans[numvber -1];
		if (branch[target -1].size() != 0) {
			for(int i :branch[target -1]) {
				add(target,i);
			}

		}

	}
}
