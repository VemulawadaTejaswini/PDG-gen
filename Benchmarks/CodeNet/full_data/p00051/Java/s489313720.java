import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int n, data, i, j, t1, t2;
	int[] t = new int[8];
	int[] max = new int[8];
	int[] min = new int[8];

	n = stdIn.nextInt();
	while (n-- > 0) {
	    t1 = 0;
	    t2 = 0;
	    data = stdIn.nextInt();
	    for (i = 0; i < 8; i++) {
		t[7-i] = data % 10;
		data /= 10;
	    }
	    arrayCopy(t, max);
	    arrayCopy(t, min);

	    sortMax(max);
	    sortMin(min);

	    j = 0;
	    for (i = 10000000; i > 0; i /= 10)
		t1 += max[j++] * i;

	    j = 0;
	    for (i = 10000000; i > 0; i /= 10)
		t2 += min[j++] * i;
	    
	    System.out.print(t1 - t2);
	    System.out.println();

	}
	
    }

    public static void arrayCopy(int[] a, int[] b) {
	int i;
	for (i = 0; i < 8; i++) {
	    b[i] = a[i];
	}
    }

    public static void sortMax(int[] a) {
	int i, j, t;
	for (i = 0; i < 8; i++) 
	    for (j = 7; j > i; j--) 
		if (a[j] > a[j-1]) {
		    t = a[j];
		    a[j] = a[j-1];
		    a[j-1] = t;
		}
    }

    public static void sortMin(int[] a) {
	int i, j, t;
	for (i = 0; i < 8; i++) 
	    for (j = 7; j > i; j--) 
		if (a[j] < a[j-1]) {
		    t = a[j];
		    a[j] = a[j-1];
		    a[j-1] = t;
		}
    }
}