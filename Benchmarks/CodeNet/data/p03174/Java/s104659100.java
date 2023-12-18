import java.util.*;

// O - Matching
// Jul 15 2019
public class Main {

	public static void main(String[] args) {

		// Scan
		Scanner sc = new Scanner(System.in);

		try {
			// read items
			int numN = sc.nextInt();
			numN = numN * numN;
			int[] arr = new int[numN];
			for (int i=0; i < numN; i++) arr[i] = sc.nextInt();

			// calc items
			int result = new Main().calc(arr);

			// write items
			System.out.println(result);
		} finally {
			if (sc != null) sc.close();
		}
    }

    public int calc(int[] arr) {

        Entrance ent = new Entrance();
        int result = 0;

        try {
            result = ent.execCalc(arr);
        } catch (Exception e) {
            // any exception
            throw e;
        }

        return result;
    }

/**
 * Answer<br>
 * if listsize exceeded MAX, all data at that point shall be erased.
 */
class Answer<T> {

	private static final int MAX = 1_000_000_007;

    private List<T> seqs;

    Answer() {
        seqs = new ArrayList<>();
    }

    public void add(T seq) {

        seqs.add(seq);
        if(seqs.size() >= MAX) {
            // listsize exceeded MAX
            seqs = new ArrayList<>();
        }
    }

    public int getCount() {
        return seqs.size();
    }
}

/**
 * Imply
 */
class Imply<T> {

    private Deque<T> tasks;

    Imply() {
        tasks = new ArrayDeque<>();
    }

    public void add(T task) {
        tasks.add(task);
    }

    public T remove() {
        return tasks.removeFirst();
    }
}

/**
 * Entrance
 */
class Entrance {

    static final int TRU = 1;
    // static final int FALS = 0;

    /**
     * Seq
     * [1,2,3,4], [3,2,1,4], [4,1,2,3], etc.
     */
    class Seq {
        private List<Integer> nums;

        Seq() {
            nums = new ArrayList<>();
        }

        public void init() {
            nums = new ArrayList<>();
        }

        public void add(int num) {
            nums.add(num);
        }
    }

    class Task {

        class Pair {
            private int p;
            private int q;
            Pair() {}
            public void put(int p, int q) {
                this.p = p;
                this.q = q;
            }
            public int getKey() {
                return p;
            }
            public int getValue() {
                return q;
            }
        }

        // public fields
        // not duplicate
        public List<Pair> kouho;
        public List<Pair> summary;

        public Task() {
            kouho = new ArrayList<>();
            summary = new ArrayList<>();
        }
    }

    /**
     * execCalc
     * @param arr request
     * @return result
     */
    public int execCalc(int[] arr) {

        Answer<Seq> answer = new Answer<>();

        // make rootTask
        Task rootTask = new Task();

        int len = (int) Math.sqrt(arr.length);

        // arr -> first summary
        for (int cnt=0; cnt < len; cnt++) {
            if (arr[cnt] == TRU) {
                Task.Pair tp = rootTask.new Pair();
                // key = cnt / len
                // val = cnt % len
                tp.put(cnt / len, cnt % len);
                rootTask.summary.add(tp);
            }
        }

        // call run
        if (rootTask.summary.size() != 0) {
            Imply<Task> imply = new Imply<>();
            imply.add(rootTask);

            try {
                while (true) run(imply, answer);
            } catch(NoSuchElementException e) {
                // while end
            }
        }

        // return answer
        return answer.getCount();
    }

    /**
     * run
     * @param imply
     * @param answer
     */
    private void run(Imply<Task> imply, Answer<Seq> answer)
    throws NoSuchElementException {

        Task task = imply.remove();

        int iKey = task.summary.get(0).getKey();
        for (Task.Pair tp : task.summary) {

            if (iKey != tp.getKey()) break;

            // make subtask
            Task subtask = new Task();

            subtask.kouho.addAll(task.kouho);
            subtask.kouho.add(tp);

            for (Task.Pair tmpTp : task.summary) {
                if (tmpTp.getKey() != tp.getKey()
                && tmpTp.getValue() != tp.getValue()) {
                    subtask.summary.add(tmpTp);
                }
            }

            if (subtask.summary.size() == 0) {
                // put kouho to answer
                Seq seq = new Seq();
                for (Task.Pair tmpTp : subtask.kouho) {
                    seq.add(tmpTp.getValue());
                }
                answer.add(seq);

            } else {
                // add subtask to imply
                imply.add(subtask);
            }
        }
    }

}
}
