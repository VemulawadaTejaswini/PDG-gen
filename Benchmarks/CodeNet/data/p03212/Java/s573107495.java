import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		int[] A = new int[60000];

		int[] dA = {3,5,7};
		int x = 0;
		int y = 0;

		int count = 0;
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("3");
		queue.add("5");
		queue.add("7");

		while(y < N){
			x = Integer.parseInt(queue.poll());
			for(int i = 0 ; i < 3 ; i++){
				y = x * 10 + dA[i];
				queue.add(String.valueOf(y));
				//System.out.println(y);

			if(y >100 && y <= N){
				//System.out.println(y);
				String yy = String.valueOf(y);
				if(yy.contains("3")&&yy.contains("5")&&yy.contains("7")){
					//System.out.println(yy);
					count++;
				}
			}


			}
		}

		System.out.println(count);
	}
}
