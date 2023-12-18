import java.util.ArrayList;
import java.util.Scanner;

class BW {
	private int fH;
	private int fW;
	private boolean fIsBlack;

	public BW(int h, int w, boolean isBlack) {
		fH = h;
		fW = w;
		fIsBlack = isBlack;
	}

	public int getH() {
		return fH;
	}

	public int getW() {
		return fW;
	}

	public boolean isBlack() {
		return fIsBlack;
	}

	public int dist(BW bw) {
		return Math.abs(fH - bw.getH()) + Math.abs(fW - bw.getW());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<BW> BWList = new ArrayList<BW>(H * W);
		for (int i = 0; i < H; i++) {
			String raw = sc.next();
			for (int j = 0; j < W; j++) {
				if (raw.charAt(j) == '#') {
					BWList.add(new BW(i, j, true));
				} else if (raw.charAt(j) == '.') {
					BWList.add(new BW(i, j, false));
				}
			}
		}
		sc.close();

		int max = 0;
		int min;
		for (int i = 0; i < H * W; i++) {
			if (!BWList.get(i).isBlack()) {
				min = Integer.MAX_VALUE;
				for (int j = 0; j < H * W; j++) {
					if (BWList.get(j).isBlack()) {
						int dist = BWList.get(i).dist(BWList.get(j));
						if (min > dist)
							min = dist;
					}
				}
				if (max < min)
					max = min;
			}
		}
		System.out.println(max);
	}
}