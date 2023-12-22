import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] p = new int[24];
	double[] t = new double[24];

	for (int i = 0; i < 24; i++) {
	    p[i] = sc.nextInt();
	    t[i] = sc.nextDouble();
	}

	sort(p, t, 0, 7);
	System.out.println(p[0] +" "+ t[0]);
	System.out.println(p[1] +" "+ t[1]);
	t[0] = 101.0;
	t[1] = 101.0;

	sort(p, t, 8, 15);
	System.out.println(p[8] +" "+ t[8]);
	System.out.println(p[9] +" "+ t[9]);
	t[8] = 101.0;
	t[9] = 101.0;

	sort(p, t, 16, 23);
	System.out.println(p[16] +" "+ t[16]);
	System.out.println(p[17] +" "+ t[17]);
	t[16] = 101.0;
	t[17] = 101.0;

	sort(p, t, 0, 23);
	System.out.println(p[0] +" "+ t[0]);
	System.out.println(p[1] +" "+ t[1]);
    }

    public static void sort(int[] a, double[] b, int start, int last) {
	for (int i = 0; i <= last; i++)
	    for (int j = i; j > start; j--)
		if (b[j-1] > b[j]) {
		    double t = b[j-1];
		    b[j-1] = b[j];
		    b[j] = t;
		    int s = a[j-1];
		    a[j-1] = a[j];
		    a[j] = s;
		}
    }
}