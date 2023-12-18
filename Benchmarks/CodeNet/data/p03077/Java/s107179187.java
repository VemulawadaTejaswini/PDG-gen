import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	long N = sc.nextLong();
	long data[] = new long[5];
	data[0] = sc.nextLong();
	int min = 0;
	for (int i = 1; i < data.length; i++) {
	    data[i] = sc.nextLong();
	    if (data[min] > data[i]) {
		min = i;
	    }
	}

	System.out.println((long)((N + data[min] - 1) / data[min]) + 4);
    }
}