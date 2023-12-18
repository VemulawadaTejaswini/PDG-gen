import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = Long.parseLong(scan.next());
		long C = Long.parseLong(scan.next());
		long K = Long.parseLong(scan.next());
		long bus = 0;
		LinkedList<Long> times = new LinkedList<>();
		while(scan.hasNext()) {
			times.add(Long.parseLong(scan.next()));
		}
		while(!times.isEmpty()) {
			bus++;
			long end = times.getLast() + K;
			long passNum = 0;
			while(!times.isEmpty() && passNum <= C) {
				long time = times.getLast();
				if (time <= end) {
					times.removeLast();
					passNum++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(bus);
	}

}