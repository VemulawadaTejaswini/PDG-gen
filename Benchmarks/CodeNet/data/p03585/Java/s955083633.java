import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;

class Pair<X, Y> {
	X fi;
	Y se;
	Pair(X fi, Y se) {
		this.fi = fi;
		this.se = se;
	}
}

class Line {
	double a, b, c;
	int pos;
	Line(double x, double y, double z, int pos) {
		this.a = x;
		this.b = y;
		this.c = z;
		this.pos = pos;
	}
}

class cmp implements Comparator<Pair<Double, Integer>>{
	public int compare(Pair<Double, Integer> a, Pair<Double, Integer> b) {
		if(a.fi * b.fi > 0) {
			if(a.fi < b.fi) return -1;
			return 1;
		} else {
			if(a.fi >= 0) return -1;
			return 1;
		}
	}
}

class cmp_1 implements Comparator<Pair<Double, Integer>>{
	public int compare(Pair<Double, Integer> a, Pair<Double, Integer> b) {
		if(a.fi < b.fi) return -1;
		return 1;
	}
}

class cmp_2 implements Comparator<Pair<Double, Integer>>{
	public int compare(Pair<Double, Integer> a, Pair<Double, Integer> b) {
		if(a.fi * b.fi < 0) {
			if(a.fi >= 0) return -1;
			return 1;
		}
		else if(a.fi >= 0 && b.fi >= 0) {
			if(a.fi > b.fi) return -1;
			return 1;
		} else {
			if(a.fi > b.fi) return -1;
			return 1;
		}
	}
}

public class Main {

	static final int N = (int)4e4 + 100;
	static final double oo = 1e18;
	static int[] bit = new int[N];
	static final double ops = 0.000000000001;

	static int n;
	static ArrayList<Line> p = new ArrayList<Line>();

	static void Exit() { System.exit(0); }

	static void upd(int pos, int val) {
		for(int i = pos; i < N; i += (i & (-i)))
			bit[i] += val;
	}
	static int get(int pos) {
		int res = 0;
		for(int i = pos; i > 0; i -= (i & -i))
			res += bit[i];
		return res;
	}

	static boolean Equal(Double x, Double y) {
		if(x > y) return (x - y) <= ops;
		return y - x <= ops;
	}

	static int calc(double mid, int flag) {
		int res = 0;

		ArrayList<Pair<Double, Integer>> tmp = new ArrayList<Pair<Double, Integer>> ();

		if(flag == 0) {
			for(int i = 0; i < n; i += 1) {
				double cur = (p.get(i).c - p.get(i).b * mid) / p.get(i).a;
				tmp.add(new Pair<Double, Integer>(cur, i));

				//if(p.get(i).c / p.get(i).b >= mid) res += 1;
				//if(mid >= 0.00) res += 1;
			}
		} else {
			for(int i = 0; i < n; i += 1) {
				double cur = (p.get(i).c - p.get(i).a * mid) / p.get(i).b;
				tmp.add(new Pair<Double, Integer> (cur, i));

				//if(p.get(i).c / p.get(i).a >= mid) res += 1;
				//if(mid >= 0.00) res += 1;
			}
		}
		Collections.sort(tmp, new cmp_1());
//for(Pair<Double, Integer> v: tmp) System.out.println(v.fi + " " + v.se + " " +  p.get(v.se).pos);

		int pos = 0;

		ArrayList<Pair<Double, Integer>> equal = new ArrayList<Pair<Double, Integer>> ();
		while(pos < tmp.size()) {
			equal.add(tmp.get(pos++));
			res += get(p.get(tmp.get(pos - 1).se).pos);

			while(pos < tmp.size() && Equal(tmp.get(pos - 1).fi, tmp.get(pos).fi) == true) {
				res += get(p.get(tmp.get(pos).se).pos);
				equal.add(tmp.get(pos ++));
			}	
			for(Pair<Double, Integer> v: equal) upd(p.get(v.se).pos, 1);
			if(equal.size() > 1) res += 1;
			equal.clear();
		}
		return res;
	}

	public static void main(String[] args) {
//		File Test = new File("test.inp");
//		try {
			Scanner inp = new Scanner(System.in);
			n = inp.nextInt();

			ArrayList<Pair<Double, Integer>> tmp = new ArrayList<Pair<Double, Integer>> ();
			for(int i = 1; i <= n; ++i) {
				double a = inp.nextDouble();
				double b = inp.nextDouble();
				double c = inp.nextDouble();
				p.add(new Line(a, b, c, 0));
				tmp.add(new Pair<Double, Integer> (-a / b, i - 1));
			}

			Collections.sort(tmp, new cmp());

			//for(Pair v: tmp) System.out.println(v.fi + " " + v.se);

			double xlef = -oo, xrig = oo;
			double ylef = -oo, yrig = oo;
			
			int goal = ((n - 1) * n / 2 + 2) / 2;

//			int cnt = 0;
//			for(Pair<Double, Integer> v: tmp) p.get(v.se).pos = ++cnt;
//			System.out.println(calc(1.00, 0)); Exit();

			// Line y = A
			int cnt = 0;
			for(Pair<Double, Integer> v: tmp) p.get(v.se).pos = ++cnt;

			while(xrig - xlef > ops) {
//				System.out.println(xlef + " " + xrig);
				for(int i = 0; i < N; ++i) bit[i] = 0;
				double mid = (xlef + xrig + ops) / 2.00;
				if(calc(mid, 0) >= goal) xlef = mid;
				else xrig = mid - ops;
			}
			for(int i = 0; i < N; ++i) bit[i] = 0;
//			System.out.println(calc(-1.722222222222222, 0));			
			//Line x = A
			Collections.sort(tmp, new cmp_2());
			cnt = 0;
			for(Pair<Double, Integer> v: tmp) p.get(v.se).pos = ++cnt;
			
			while(yrig - ylef > ops) {
				for(int i = 0; i < N; ++i) bit[i] = 0;
				double mid = (ylef + yrig + ops) / 2;
				if(calc(mid, 1) >= goal) ylef = mid;
				else yrig = mid - ops;
//				System.out.println(ylef + " " + yrig);
			}

//			System.out.println(goal);
//			System.out.println(calc(0, 0));
			System.out.print(ylef + " " + xlef);
//		}
//		catch(FileNotFoundException ex) {
//			// Do nothing
//		}


	}
}