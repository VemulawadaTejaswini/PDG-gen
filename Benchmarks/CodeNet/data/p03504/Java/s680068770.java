import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Program> programs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int channel = sc.nextInt();
			programs.add(new Program(start, end, channel));
		}
		sc.close();
		programs.stream().sorted(Comparator.comparing(Program::getChannel).thenComparing(Comparator.comparing(Program::getStart)));
//		Collections.sort(programs, new ComparatorStart());
//		Collections.sort(programs, new ComparatorChannel());

		for (int i = 1; i < programs.size(); i++) {
			if (programs.get(i).getStart() == programs.get(i - 1).getEnd() && programs.get(i).getChannel() == programs.get(i - 1).getChannel()) {
				programs.get(i - 1).setEnd(programs.get(i).getEnd());
				programs.remove(i);
				i--;
			}
		}

		HashMap<Integer, Integer> timeTable = new HashMap<>();
		int answer = 0;
		for (Program program : programs) {
			for (int d = program.getStart() - 1; d < program.getEnd(); d++) {
				if (timeTable.containsKey(d)) {
					timeTable.put(d, timeTable.get(d) + 1);
					answer = Math.max(timeTable.get(d), answer);
				} else {
					timeTable.put(d, 1);
					answer = Math.max(answer, 1);
				}
			}
		}

		System.out.println(answer);
	}
}

class Program {
	private int start;
	private int end;
	private int channel;
	public Program(int start, int end, int channel) {
		this.start = start;
		this.end = end;
		this.channel = channel;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getChannel() {
		return channel;
	}
}

//class ComparatorStart implements Comparator<Program> {
//	@Override
//	public int compare(Program prog1, Program prog2) {
//		if (prog1.getStart() < prog2.getStart()) {
//			return -1;
//		} else if (prog1.getStart() > prog2.getStart()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
//}
//
//class ComparatorChannel implements Comparator<Program> {
//	@Override
//	public int compare(Program prog1, Program prog2) {
//		if (prog1.getChannel() < prog2.getChannel()) {
//			return -1;
//		} else if (prog1.getChannel() > prog2.getChannel()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
//}