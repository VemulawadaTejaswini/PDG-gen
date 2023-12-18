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
			int height = Integer.parseInt(sc.next());
			platFormList.add(new Platform(height));
		}

		for (int i = 0; i < roadNum; i++) {
			int platformFrom = Integer.parseInt(sc.next());
			int platformTo = Integer.parseInt(sc.next());
			if (platFormList.get(platformFrom - 1).getHeight() < platFormList.get(platformTo - 1).getHeight()) {
				platFormList.get(platformFrom - 1).setGood(false);
			} else {
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
	private int height;
	private boolean isGood = true;

	public Platform(int height) {
		setHeight(height);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

}
