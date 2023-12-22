import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int s = scanner.nextInt();

			if (x == 0 && y == 0 && s == 0) {
				break;
			}

			int maxNewPrice = 0;

			for(int i = 1; i < s; i++) {
				int ax = i;
				int bx = s-i;

				int ay = getMaxHontai(ax, x)*(100+y)/100;
				int by = getMaxHontai(bx, x)*(100+y)/100;

				if(ay ==0 || by ==0) {
					continue;
				}

				int newPrice = ay + by;



				if(newPrice>maxNewPrice){
					maxNewPrice=newPrice;
				}
			}


			System.out.println(maxNewPrice);

		}
		scanner.close();
		return;
	}

	public static int getMaxHontai(int ax, int x) {
		int i = ax;
		for(; ;i--) {
			int j = i*(100+x)/100;
			if(j==ax) {
				break;
			}
			if(j<ax) {
				return 0;
			}
		}

		return i;
	}
}
