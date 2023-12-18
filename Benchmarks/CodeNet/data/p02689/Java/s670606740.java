import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Tenbodai[] list = new Tenbodai[n];
		int sum = 0;

		for(int i = 0; i < n; i++) {
			list[i] = new Tenbodai(sc.nextLong());
		}

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a - 1].edge.add(b - 1);
			list[b - 1].edge.add(a - 1);
		}

		for(int i = 0; i < n; i++) {
			boolean b = true;
			List<Integer> to = list[i].edge;
			long height = list[i].height;
			if(to.size() == 0) b = false;
			for(Integer var : to) {
				if(height <= var) {
					b = false;
					break;
				}
			}
			if(b) sum++;
		}

		System.out.println(sum);

		sc.close();
	}
}

class Tenbodai{
	long height;
	List<Integer> edge;

	Tenbodai(long height){
		this.height = height;
		this.edge = new ArrayList<>();
	}
}