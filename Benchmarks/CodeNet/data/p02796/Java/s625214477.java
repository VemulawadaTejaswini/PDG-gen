import javax.sound.midi.Soundbank;
import java.util.*;

class Machine implements Comparable<Machine> {
	private final int id;
	Set<Machine> machines = new HashSet<>();

	int start;
	int end;

	Machine(int id,int pos, int len) {
		this.id = id;
		start = pos - len + 1;
		end = pos + len;
	}

	boolean occupied(int i) {
		return i >= start && end >= i;
	}

	boolean occupied(Machine machine){
		return machine.start >= this.start && this.end >= machine.start ||
				machine.end >= this.start && this.end >= machine.end;
	}

	void add(Machine machine) {
		machines.add(machine);
	}

	int affects() {
		return machines.size();
	}

	@Override
	public int compareTo(Machine o) {
		return Comparator.comparingInt(Machine::affects).compare(this, o);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Machine machine = (Machine) o;

		return id == machine.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] L = new int[N];
		Machine[] machines = new Machine[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			L[i] = sc.nextInt();
			machines[i] = new Machine(i,X[i], L[i]);
		}

		for (int i = 0; i < machines.length; i++) {
			Machine m1 = machines[i];
			for (int j = i + 1; j < machines.length; j++) {
				Machine m2 = machines[j];
				if (m1.occupied(m2)) {
					m1.add(m2);
					m2.add(m1);
				}
			}
		}

		Arrays.sort(machines, Comparator.reverseOrder());
		NavigableSet<Machine> machineSet = new TreeSet<>(Comparator.reverseOrder());
		machineSet.addAll(Arrays.asList(machines));

		int removed = 0;
		int i = 0;
//		for (; i < machines.length; i++) {
		Machine machine;
		while (true) {
			machine = machineSet.pollFirst();
			if (machine == null) break;
			if (machine.machines.isEmpty()) break;
			for (Machine m : machine.machines) {
				machineSet.remove(m);
				m.machines.remove(m);
				if (!m.machines.isEmpty()) machineSet.add(m);
			}
			machine.machines.clear();
			removed += 1;
		}
//		}

		System.out.println(N - removed + 1);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}