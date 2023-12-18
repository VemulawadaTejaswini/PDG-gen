import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int x[] = new int[5];
	int y[] = new int[5];
	for (int i = 0; i < 5; i++) {
	    x[i] = sc.nextInt();
	    y[i] = x[i] % 10;
	}

	for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
		if (y[j - 1] < y[j]) {
		    int tmp_x = x[j - 1];
		    x[j - 1] = x[j];
		    x[j] = tmp_x;

		    int tmp_y = y[j - 1];
		    y[j - 1] = y[j];
		    y[j] = tmp_y;
		}
	    }
	}

	int count = 0;
	int z = 4;
	while (y[z] == 0) {
	    count += x[z];
	    z--;
	    if (z == -1)
		break;
	}
	
	int k;
	for (k = 0; k < z; k++)
	    count += (x[k] - y[k]) + 10;

	if (z != -1)
	    System.out.println(count + x[z]);
	else
	    System.out.println(count);
    }
}