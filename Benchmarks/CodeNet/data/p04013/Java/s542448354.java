import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arg[] = br.readLine().split(" ");
		long n = Long.parseLong(arg[0]);
		int a = Integer.parseInt(arg[1]);
		ArrayList<Long> inp = new ArrayList<Long>();
		arg = br.readLine().split(" ");
		for (int i = 0; i < arg.length; i++) {
			inp.add(Long.parseLong(arg[i]));
		}
		Solver sol = new Solver();
		System.out.println(sol.solve(inp, a));
	}

}

class Solver {
	long solve(ArrayList<Long> inp, int avg) {
		long res[] = new long[1];
		solve2(new ArrayList<Long>(), inp, res, avg);
		return res[0];
	}

	void solve2(ArrayList<Long> soFar, ArrayList<Long> remaining, long[] res, int avg) {
		if (remaining.size() == 0) {
			if (hasRequiredAverage(soFar, avg)) {
				res[0]++;
			}
			return;
		}
		ArrayList<Long> tempSoFar = new ArrayList<Long>(soFar);
		ArrayList<Long> tempSoFar2 = new ArrayList<Long>(soFar);
		tempSoFar.add(remaining.get(0));
		remaining.remove(0);
		ArrayList<Long> rem1 = new ArrayList<Long>(remaining);
		ArrayList<Long> rem2 = new ArrayList<Long>(remaining);
		solve2(tempSoFar, rem1, res, avg);
		solve2(tempSoFar2, rem2, res, avg);

	}

	boolean hasRequiredAverage(ArrayList<Long> inp, int avg) {
		int sum = 0;
		for (long i : inp) {
			sum += i;
		}
		if (inp.size() == 0)
			return false;
		if (sum == inp.size() * avg)
			return true;
		return false;
	}

}
