import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<Queue<Integer>> S = new ArrayList<Queue<Integer>>();
			for(int i=0;i<n;i++) {
				S.add(new ArrayDeque<>());
			}

			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				int t = sc.nextInt();
				switch(query) {
				case 0:
					S.get(t).add(sc.nextInt());
					break;
				case 1:
					if(S.get(t).size()>0)
						System.out.println(S.get(t).peek());
					break;
				case 2:
					if(S.get(t).size()>0)
						S.get(t).poll();
					break;
				}
			}
		}
	}
}
