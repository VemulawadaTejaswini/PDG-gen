import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int L, R;
	L = sc.nextInt();
	R = sc.nextInt();

	int min = L % 2019;
	for (int i = L + 1; i < L + 2019 && i <= R; i++) {
	    if (min > i % 2019) {
		min = i % 2019;
	    }

	    if (min == 0) {
		break;
	    }
	}

	System.out.println(min * (min + 1));
    }
}