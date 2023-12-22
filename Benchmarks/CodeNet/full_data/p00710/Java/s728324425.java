import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	while(scan.hasNext()) {
	    int n = scan.nextInt();
	    int r = scan.nextInt();

	    if (0 == n && 0 == r)
		break;

	    int[] yama = new int[n]; // 花札の山
	    for (int i=0; i<n; i++)
		yama[i] = n-i;

	    // カット
	    for (int i=0; i<r; i++) {
		int p = scan.nextInt();
		int c = scan.nextInt();
		cut(yama,p,c);
	    }

	    System.out.println(yama[0]);
	}    
    }

    private static void cut(int[] array, int p, int c) {
	int[] temp = new int[p-1];

	for (int i=0; i<p-1; i++)
	    temp[i] = array[i];

	for (int i=0; i<c; i++) 
	    array[i] = array[p-1+i];

	for (int i=0; i<p-1; i++)
	    array[c+i] = temp[i];
    }
}