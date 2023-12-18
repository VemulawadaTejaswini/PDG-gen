
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		List<Pos> odd = new ArrayList<>();
		for(int i = 1; i < h + 1; i++) {
			for(int j = 1; j < w + 1; j++) {
				int tmp = sc.nextInt();
				if(tmp % 2 != 0) {
					odd.add(new Pos(i, j));
				}
			}
		}
		long count = 0;
		String ans = "";
		for(int i = 0; i < odd.size(); i = i + 2) {
			if(i + 1 < odd.size()) {
				Pos bef = odd.get(i);
				Pos af = odd.get(i + 1);
				if(bef.getHigh() < af.getHigh()) {
					for(int j = bef.getHigh() + 1; j < af.getHigh() + 1; j++) {
						int k = j - 1;
						ans += k + " " + bef.getWide() + " " + j + " " + bef.getWide() + "\n";
						count++;
					}
				} else if(bef.getHigh() > af.getHigh()) {
					for(int j = bef.getHigh() - 1; j > af.getHigh() - 1; j--) {
						int k = j + 1;
						ans += k + " " + bef.getWide() + " " + j + " " + bef.getWide() + "\n";
						count++;
					}
				}
				if(bef.getWide() < af.getWide()) {
					for(int j = bef.getWide() + 1; j < af.getWide() + 1; j++) {
						int k = j - 1;
						ans += af.getHigh() + " " + k + " " + af.getHigh() + " " + j + "\n";
						count++;
					}
				} else if(bef.getWide() > af.getWide()) {
					for(int j = bef.getWide() - 1; j > af.getWide() - 1; j--) {
						int k = j + 1;
						ans += af.getHigh() + " " + k + " " + af.getHigh() + " " + j + "\n";
						count++;
					}
				}
			}
		}
		System.out.println(count + "\n" + ans);
	}

}

class Pos {
	private int high;
	private int wide;

	protected Pos(int high, int wide) {
		super();
		this.high = high;
		this.wide = wide;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

}