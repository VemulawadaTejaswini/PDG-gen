import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		Dishes dishes = new Dishes(a, b, c, d, e);
		System.out.println(dishes.getTotalTime());
	}

}

class Dishes {
	ArrayList<Integer> times = new ArrayList<Integer>();
	ArrayList<Integer> losses = new ArrayList<>();

	Dishes(int... times) {
		for (int t : times) {
			this.times.add(t);
			int loss = (10 - t % 10) % 10;
			losses.add(loss);
		}
	}

	int getTotalTime() {
		int totalTime = 0;
		int maxLoss = 0;
		for (int time : times) {
			totalTime += time;
		}
		for (int loss : losses) {
			totalTime += loss;
			if (loss > maxLoss) {
				maxLoss = loss;
			}
		}
		totalTime -= maxLoss;
		return totalTime;
	}
}