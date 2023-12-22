import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] r = new int[n];
	for (int i = 0; i < n; i++) {
	    r[i] = Integer.parseInt(scan.nextLine());
	}
	int max = r[1] - r[0];
	for (int i = 2; i < n; i++) {
	    for (int j = i - 1; j >= 0; j--) {
		int diff = r[i] - r[j];
		if (max < diff) {
		    max = diff;
		}
	    }
	}
	System.out.println(max);
    }
}