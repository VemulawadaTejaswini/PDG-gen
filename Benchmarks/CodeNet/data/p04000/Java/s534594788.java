
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int W;
    private static int H;

    public static void main(String[] args) {
	H = Integer.parseInt(scan.next());
	W = Integer.parseInt(scan.next());
	int N = Integer.parseInt(scan.next());
	Grid[] black = new Grid[N];
	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next()) - 1;
	    int b = Integer.parseInt(scan.next()) - 1;
	    black[i] = new Grid(a, b);
	}

	Arrays.sort(black, new Comparator<Grid>() {
		@Override
		public int compare(Grid o1, Grid o2) {
		    return o1.dist() - o2.dist();
		}
	    });

	long[] ans = new long[10];

	List<Grid> m0 = new ArrayList<Grid>();
	List<Grid> m1 = new ArrayList<Grid>();
	List<Grid> m2 = new ArrayList<Grid>();
	int current = 0;
	for (int i = 0; i < N; i++) {
	    if(black[i].dist() != current) {
		current = black[i].dist();
		for(Grid s: m2) {
		    ans[s.count]++;
		}
		m2 = m1;
		m1 = m0;
		m0 = new ArrayList<Grid>();
	    }
	    List<Grid> square = getSquare(black[i]);
	    for(Grid s: square) {
		int index;
		if((index = m2.indexOf(s)) >= 0) {
		    m2.get(index).count++;
		} else if ((index = m1.indexOf(s)) >= 0) {
		    m1.get(index).count++;
		} else if ((index = m0.indexOf(s)) >= 0) {
		    m0.get(index).count++;
		} else {
		    s.count = 1;
		    m0.add(s);
		}
	    }
	}
	for(Grid s: m2) ans[s.count]++;
	for(Grid s: m1) ans[s.count]++;
	for(Grid s: m0) ans[s.count]++;

	ans[0] = (long)(H-2)*(W-2);
	for (int i = 1; i < 10; i++) {
	    ans[0] = ans[0] - ans[i];
	}
	
	for (int i = 0; i < 10; i++) {
	    System.out.println(ans[i]);
	}	
	scan.close();
    }

    private static class Grid {
	int a;
	int b;
	int count = 0;

	public Grid(int a, int b) {
	    this.a = a;
	    this.b = b;
	}

	public int dist() {
	    return Integer.max(a, b);
	}

	@Override
	public boolean equals(Object o) {
	    if(o instanceof Grid) {
		Grid g = (Grid) o;
		if(g.a == this.a && g.b == this.b) return true;
		else return false;
	    } else {
		return false;
	    }
	}
    }

    private static boolean isValid(int a, int b) {
	if(a > 0 && a < H-1 && b > 0 && b < W-1) return true;
	else return false;
    }

    private static List<Grid> getSquare(Grid grid) {
	int a = grid.a;
	int b = grid.b;
	List<Grid> result = new ArrayList<Grid>();
	for (int i = -1; i < 2; i++) {
	    for (int j = -1; j < 2; j++) {
		if(isValid(a+i, b+j)) result.add(new Grid(a+i, b+j));
	    }
	}
	return result;
    }
}
