import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int menuNum = sc.nextInt();
	int[]  menuArray = new int [menuNum];
	int[]  manzokuArray = new int [menuNum];
	int[]  manpukuArray = new int [menuNum];
	int lastManzoku = 0;
	boolean lastMem= false;
	int count = 0;

	for(int i = 0; i < menuNum; i++) {
		menuArray[i] = sc.nextInt();
	}

	for(int i = 0; i < menuNum; i++) {
		manzokuArray[i] = sc.nextInt();
	}

	for(int i = 0; i < menuNum - 1; i++) {
		manpukuArray[i] = sc.nextInt();
	}

	for(int i = 0; i < menuNum; i++) {
		lastManzoku += manzokuArray[menuArray[i]];
		if(menuArray[i] == (menuArray[i+1] - 1)) {
			lastMem = true;
		} else {
			lastMem = false;
		}
		if(lastMem) {
			lastManzoku += manpukuArray[count];
			count++;
		}
	}

	System.out.println(lastManzoku);

    // Scannerクラスのインスタンスをクローズ
	sc.close();
	}
}
