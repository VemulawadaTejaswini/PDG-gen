import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static int[] minSegment;

	private static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> hList = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			hList.add(sc.nextInt());
		}

		makeSegment(hList);

		System.out.println(giveWater(hList, 0));

	}

	private static int giveWater(List<Integer> hList, int startIdx) {
		int waterCount = 0;

		if(hList.isEmpty()) {
			return 0;
		}
		int minH;
		int endIdx = startIdx + hList.size() - 1;
		if (startIdx == endIdx) {
			minH = hList.get(0);
		} else {
			minH = getMinVal(startIdx, endIdx);
		}


		List<Integer> newHList = new ArrayList<Integer>();
		int idx = 0;
		for(int i = 0; i < hList.size(); i++) {
			int h = hList.get(i);
			int newH = h - minH;

			int segIdx = n + (startIdx + i) - 1;

			if(newH == 0) {
				updateSegment(segIdx, Integer.MAX_VALUE);

				waterCount += giveWater(newHList, idx);

				idx = i + 1;
				newHList = new ArrayList<Integer>();
			} else {
				updateSegment(segIdx, newH);
				newHList.add(newH);
			}
		}

		waterCount += giveWater(newHList, idx);

		return waterCount + minH;

	}

	private static void makeSegment(List<Integer> values) {
		n = 1;
		while(n < values.size()) {
			n *= 2;
		}

		int segLen = 2 * n - 1;

		minSegment = new int[segLen];
		for(int j = 0; j < segLen; j++) {
			minSegment[j] = Integer.MAX_VALUE;
		}

		for(int j = 0; j < values.size(); j++) {
			int segIdx = n + j - 1;
			updateSegment(segIdx, values.get(j));
		}

	}

	private static void updateSegment(int idx, int val) {

		minSegment[idx] = val;

		while(idx > 0) {
			idx = (idx-1)/2;
			minSegment[idx] = Math.min(minSegment[2*idx + 1], minSegment[2*idx + 2]);
		}
	}

	private static int getMinVal(int l, int r) {
		int minVal = Integer.MAX_VALUE;

		l = n + l - 1;
		r = n + r - 1;

		if(l % 2 == 0) {
			minVal = minSegment[l];
			l++;
		}
		if(r % 2 != 0) {
			minVal = Math.min(minVal, minSegment[r]);
			r--;
		}

		while(l<r) {
			l = (l-1)/2;
			r = (r-1)/2;

			if(l % 2 == 0) {
				minVal = Math.min(minVal, minSegment[l]);
				l++;
			}
			if(r % 2 != 0) {
				minVal = Math.min(minVal, minSegment[r]);
				r--;
			}
		}

		return minVal;
	}

}

