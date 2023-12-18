import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<List<Integer>> ptnList = new ArrayList<List<Integer>>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Point> pointList = new ArrayList<Point>();

		for(int i = 0; i < n; i++) {
			Point p = new Point();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			pointList.add(p);
		}

		List<Integer> elm = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			elm.add(i);
		}
		List<Integer> empty = new ArrayList<Integer>();
		permutation(elm, empty);

		double totalLength = 0;
		for(int i = 0; i < ptnList.size(); i++) {
			List<Integer> ptn = ptnList.get(i);
			for(int j = 0; j < ptn.size() - 1; j++) {
				Point p1 = pointList.get(ptn.get(j));
				Point p2 = pointList.get(ptn.get(j+1));
				totalLength += Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y,  2));
			}
		}

		System.out.println(totalLength / ptnList.size());

		sc.close();
	}

	private static void permutation(List<Integer> elm, List<Integer> prePtn) {

		if(elm.size() < 1) {
			ptnList.add(prePtn);
			return;
		}

		for(int i = 0; i < elm.size(); i++) {
			List<Integer> ptn = new ArrayList<Integer>(prePtn);
			ptn.add(elm.get(i));

			List<Integer> nextElm = new ArrayList<Integer>(elm);
			nextElm.remove(i);
			permutation(nextElm, ptn);
		}

	}

	private static class Point{
		public double x;
		public double y;
	}

}
