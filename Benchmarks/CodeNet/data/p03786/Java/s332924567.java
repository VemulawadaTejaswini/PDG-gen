import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = Long.parseLong(scan.next());
		LinkedList<Long> slimes = new LinkedList<>();
		while(scan.hasNext()) {
			slimes.add(Long.parseLong(scan.next()));
		}
		Collections.sort(slimes);
		long sum = slimes.poll();
		long size = N;
		while (!slimes.isEmpty()) {
			long slime = slimes.poll();
			if (sum * 2 < slime) {
				size = slimes.size() + 1;
			}
			sum += slime;
		}
		System.out.println(size);
	}
}
