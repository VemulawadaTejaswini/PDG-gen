import java.io.PrintWriter;
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
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
			anski.setBranch(a,b);
		}
		for(int i = 0 ; i < q ; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			anski.setValue(a,b);
		}

		anski.add();
		anski.getAns();
	}
}

class ki{
	int ans[];
	List<Integer>[] branch;


	public ki(int n) {
		ans = new int[n];
		branch = new ArrayList[n];
		for (int i = 0 ; i < n ; i++) {
			ans[i] = 0;
			branch[i] = new ArrayList<Integer>();
		}
	}

	public void setBranch(int a,int b) {
			branch[a -1].add(b);
			branch[b -1].add(a);
	}


	public void setValue(int number,int value) {
		ans[number -1] += value;
	}

	public void getAns() {
		PrintWriter out = new PrintWriter(System.out);
		for(int i :ans) {
			out.println(i + " ");
		};
		out.flush();
	}

     public void add() {
		for(int i :branch[0]) {
			add(1,i);
		}

	}

	public void add(int root,int target) {
        ans[target - 1] += ans[root -1];
        for(int i : branch[target -1]) {
        	if(i == root) continue ;
        	add(target,i);
        }

	}
}
