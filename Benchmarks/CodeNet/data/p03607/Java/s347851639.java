import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer>  paper= new ArrayList();
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(sc.next());
			if(paper.contains(a)) {
				paper.remove((Integer)a);
			}else {
				paper.add(a);
			}
		}
		System.out.println(paper.size());

		sc.close();
	}

}
