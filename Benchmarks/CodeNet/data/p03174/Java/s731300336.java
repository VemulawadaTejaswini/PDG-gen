import java.util.*;

// O - Matching
// Jul 6 2019
public class Main {

	private static final int MAX = 1000000007;

	class Chikuseki {

		private int chikuseki;

		Chikuseki(int chikuseki) { 
			this.chikuseki = chikuseki; 
		}

		public int getChikuseki() { 
			return chikuseki; 
		}

		public void succChikuseki() {
			chikuseki++;
			if (chikuseki >= MAX) chikuseki -= MAX;
		}
	}

	private void doCount(List<List<Integer>> sq, Chikuseki cs) {

		int len = sq.size();

		if (len == 1) {
			if (sq.get(0).get(0) == 1) cs.succChikuseki();
			return;
		}

		for (int j=0; j < len; j++) {
			
			if (sq.get(0).get(j) == 0) continue;

			List<List<Integer>> subList = new ArrayList<>();
			
			// for (int k=0; k < len; k++) {
			for (int k=1; k < len; k++) {

				List<Integer> tmpList = new ArrayList<>();
				for (int l=0; l < len; l++) {
						if (l == j) continue;

					tmpList.add(sq.get(k).get(l));
				}
				subList.add(tmpList);
			}

			doCount(subList, cs);
		}
	}

	int calc(int[] arr) {

		int len = (int) Math.sqrt(arr.length);

		List<List<Integer>> aList = new ArrayList<>();
		for (int i=0; i < len; i++) {
			List<Integer> bList = new ArrayList<>();
			for (int j=0; j < len; j++) {
				bList.add(arr[j + len * i]);
			}
			aList.add(bList);
		}

		Chikuseki cs = new Chikuseki(0);

		doCount(aList, cs);

		return cs.getChikuseki();
	}

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
			Main m = new Main();
			int result = m.calc(arr);

			// write items
			System.out.println(result);
		} finally {
			if (sc != null) sc.close();
		}
	}  
}
