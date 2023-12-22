import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		List<Human> heightList = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			long height = stdIn.nextLong();

			if(height <= n - 1) {
				heightList.add(new Human(i, height));
			}
		}

		Collections.sort(heightList);

		long cnt = 0;

		for (int i = 0; i < heightList.size(); i++) {
			for(int j = i+1; j < heightList.size(); j++) {
				Human former = heightList.get(i);
				Human latter = heightList.get(j);

				long total = heightList.get(i).getHeight() + heightList.get(j).getHeight();

				if(total > n) {
					break;
				}

				if(former.isOK(latter)) {
					cnt++;
				}


			}
		}

		System.out.println(cnt);

		stdIn.close();

	}

}

class Human implements Comparable<Human>{
	private int id;
	private long height;

	public Human(int id, long height) {
		this.id = id;
		this.height = height;
	}

	public boolean isOK(Human another) {
		return (long)Math.abs(id - another.id) == height + another.height;
	}



	public int getId() {
		return id;
	}

	public long getHeight() {
		return height;
	}

	@Override
	public int compareTo(Human o) {
		if(this.height == o.height) {
			return 0;
		}

		return this.height - o.height > 0 ? 1 : -1;
	}
}