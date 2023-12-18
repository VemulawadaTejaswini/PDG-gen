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

		anski.add(1);

		for(Long ans: anski.getAns()) {
			System.out.println(ans + " ") ;
		}

	}
}

class ki{
	Long ans[];
	List<Integer> branch[];


	public ki(int n) {
		ans = new Long[n];
		branch = new ArrayList[n];
		for (int i = 0 ; i < n ; i++) {
			ans[i] =  -1l;
			branch[i] = new ArrayList<Integer>(n -1);
		}
		ans[0] =  0l;
	}

	public void setBranch(int number,int value) {
		if(ans[number -1] != -1) {
			branch[number -1].add(value);
			ans[value -1] =  0l;
		}else {
			branch[value -1].add(number);
			ans[number -1] =  0l;
		}
	}


	public void setValue(int number,int value) {
		ans[number -1] += value;
	}

	public Long[] getAns() {
		return ans;
	}

	public void add(int numvber) {

		if (branch[numvber -1].size() != 0) {
			for(int i :branch[numvber -1]) {
				ans[i -1] += ans[numvber -1];
				add(i);
			}

		}

	}
}
