import java.util.Scanner;

class Main {
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)){
			while (true) {
				int H = sc.nextInt();
				int W = sc.nextInt();

				if ((H == 0) && (W == 0)) break;

				boolean flag = true;

				for (int i=0; i< H; i++) {
					if (flag) {
						singleL(W);
						flag = false;
					} else {
						doubleL(W);
						flag = true;
					}
				}
				System.out.print('\n');
			}
		}
	}

	static void singleL(int times) {
		boolean flag = true;
		for (int i=0; i < times; i++) {
			if (flag) {
				System.out.print('#');
				flag = false;
			} else {
				System.out.print('.');
				flag = true;
			}
		}
		System.out.print('\n');
	}

	static void doubleL(int times) {
		boolean flag = true;
		for (int i=0; i < times; i++) {
			if (flag) {
				System.out.print('.');
				flag = false;
			} else {
				System.out.print('#');
				flag = true;
			}
		}
		System.out.print('\n');
	}
}
