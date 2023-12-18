import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int touristAttractionsNum = Integer.parseInt(sc.nextLine());
		String[] hoge = sc.nextLine().split(" ");

		for (int i = 0; i < hoge.length; i++) {
			int currentPoint = 0;
			int price = 0;
			
			for (int k = 0; k < hoge.length; k++) {
				if (i == k) {
					continue;
				}
				int tmpPrice = currentPoint - Integer.parseInt(hoge[k]);
				if (tmpPrice < 0) tmpPrice = tmpPrice * -1;
				currentPoint = Integer.parseInt(hoge[k]);
				price += tmpPrice;
			}

			if (currentPoint < 0) currentPoint = currentPoint * -1;
			System.out.println(price += currentPoint);
		}
	}
}