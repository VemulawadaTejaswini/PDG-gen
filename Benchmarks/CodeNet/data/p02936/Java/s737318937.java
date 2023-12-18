import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.next());
		int q =Integer.parseInt(sc.next());
		String ansStr = "";

		ki anski = new ki(n);
		for(int i=0 ; i < n -1; i++) {
			anski.setBranch(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		for(int i = 0 ; i < q ; i++) {
			anski.setValue(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}

		for(int ans: anski.getAns()) {
			ansStr = ansStr + " " + String.valueOf(ans) ;
		}
		System.out.println(ansStr);

	}
}

class ki{
	int ans[];
	List<List<Integer>> branch;


	public ki(int n) {
		ans = new int[n];
		branch = new ArrayList<>();
		for (int i = 0 ; i < n ; i++) {
			ans[i] = 0;
			branch.add(new ArrayList<>());
		}
	}

	public void setBranch(int number,int value) {
		branch.get(number -1).add(value);
	}


	public void setValue(int number,int value) {
		if(branch.get(number -1).size() != 0) {
			for(int i = 0 ; i < branch.get(number -1).size(); i++) {
				setValue(branch.get(number -1).get(i) , value);
			}
		}
		ans[number -1] += value;
	}

	public int[] getAns() {
		return ans;
	}
}