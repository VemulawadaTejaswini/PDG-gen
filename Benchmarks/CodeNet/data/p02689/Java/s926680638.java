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
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list[a].edge.add(b);
			list[b].edge.add(a);
		}

		for(int i = 0; i < n; i++) {
			boolean b = true;
			List<Integer> to = list[i].edge;
			long height = list[i].height;
			for(Integer var : to) {
				if(height <= list[var].height) {
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