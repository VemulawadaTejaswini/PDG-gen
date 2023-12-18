import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 考えうる方策
		// リストに格納して平均値をとり、そこからの差を求める？

		ArrayList<Integer> coor = new ArrayList<Integer>();

		while(sc.hasNext()) {
			coor.add(sc.nextInt());
		}

		Collections.sort(coor);
		int middle = coor.get(coor.size()/2);
		
		int sum = 0;
		for(Integer i: coor) {
			sum += (i - middle)*(i - middle);
		}
		
		System.out.println(sum);
		
	}
}