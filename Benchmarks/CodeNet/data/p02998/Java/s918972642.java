import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> xyList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<Integer> xy = new ArrayList<>();
			xy.add(sc.nextInt());
			xy.add(sc.nextInt());
			xyList.add(xy);
		}

		int count = 0;
		boolean addFlag = true;
		while (addFlag) {
			addFlag = false;
			List<Integer> addPoint = addPoint(xyList);
			if (null != addPoint) {
				addFlag = true;
				count++;
				xyList.add(addPoint);
			}

		}
		System.out.println(count);
	}

	private static List<Integer> addPoint(List<List<Integer>> points) {
		for (List<Integer> point : points) {
			for (List<Integer> sameX : points) {
				if (point == sameX) {
					continue;
				}
				if (point.get(0) != sameX.get(0)) {
					continue;
				}
				for (List<Integer> sameY : points) {
					if (point == sameY) {
						continue;
					}
					if (point.get(1) != sameY.get(1)) {
						continue;
					}
					boolean exist = false;
					for (List<Integer> dPoint : points) {
						if (point == dPoint) {
							continue;
						}
						if (dPoint.get(0) == sameY.get(0) && dPoint.get(1) == sameX.get(1)) {
							exist = true;
							break;
						}
					}
					if (exist) {
						continue;
					}
					List<Integer> ret = new ArrayList<>();
					ret.add(sameY.get(0));
					ret.add(sameX.get(1));
					return ret;
				}
			}
		}
		return null;
	}
}
