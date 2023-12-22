import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	int x = Integer.parseInt(array[0]);
	int y = Integer.parseInt(array[1]);

	if (y == 0) {
	    System.out.println(x);
	} else {
	    array = br.readLine().split(" ");
	    int array2[] = new int[y];

	    for (int i = 0; i < y; i++) {
		array2[i] = Integer.parseInt(array[i]);
	    }

	    Arrays.sort(array2);

	    int num = -1;
	    for (int i = 0; i < y; i++) {
		if (array2[i] == x) {
		    num = i;
		}
	    }

	    if (num == -1) {
		System.out.println(x);
	    } else {
		int min = -1, max = -1;
		int inc = 0;
		for (int i = num - 1; i >= 0; i--) {
		    inc++;
		    if (array2[i] != x - inc) {
			min = x - inc;
			break;
		    }
		}

		inc = 0;
		for (int i = num + 1; i < y; i++) {
		    inc++;
		    if (array2[i] != x + inc) {
			max = x + inc;
			break;
		    }
		}

		if (min == -1 && max != -1) {
		    System.out.println(max);
		} else if (max == -1) {
		    System.out.println(min);
		} else {
		    System.out.println(x - min > max - x ? max : min);
		}
	    }
	}
    }
}
