import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		int kazu = 0;
		int answer =0;
		List<Integer> ed = new ArrayList<Integer>();
		List<Integer> maybe = new ArrayList<Integer>();

		for(int i=0;i<n;i++) {
			if(!ed.contains(i)) {
				for(int j=0;j<n;j++) {
					if(a[i]==a[j]) {
						kazu++;
						maybe.add(j);
					}
				}
				if(a[i]!=kazu) {
					a[i]=-1;
					answer++;
				}
				else {
					ed.addAll(maybe);
				}
				kazu =0;
				maybe.clear();
			}
		}
		System.out.print(answer);
	}

}
