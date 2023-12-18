import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int platformNum = Integer.parseInt(sc.next());
		int roadNum = Integer.parseInt(sc.next());
		List<Platform> platFormList = new ArrayList<>();
		for (int i = 0; i < platformNum; i++) {
			long height = Long.parseLong(sc.next());
			platFormList.add(new Platform(height));
		}

		for (int i = 0; i < roadNum; i++) {
			int platformFrom = Integer.parseInt(sc.next());
			int platformTo = Integer.parseInt(sc.next());

			long platformFromheight = platFormList.get(platformFrom - 1).getHeight();
			long platformToheight = platFormList.get(platformTo - 1).getHeight();
			if (platformFromheight < platformToheight) {
				platFormList.get(platformFrom - 1).setGood(false);
			} else if (platformToheight < platformFromheight) {
				platFormList.get(platformTo - 1).setGood(false);
			} else {
				// 同値の場合、両方いい展望台ではない
				platFormList.get(platformFrom - 1).setGood(false);
				platFormList.get(platformTo - 1).setGood(false);
			}
		}

		int count = 0;
		for (Platform platform : platFormList) {
			if (platform.isGood()) {
				count++;
			}
		}
		System.out.println(count);

	}

}

class Platform {
	private long height;
	private boolean isGood = true;

	public Platform(long height) {
		setHeight(height);
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

}
