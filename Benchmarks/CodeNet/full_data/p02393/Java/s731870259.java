import java.util.Scanner;

class Main{

	public static void main(String[] args) {

	int[] n;
	n = new int[3];
	
	int min, mid, max;

	Scanner scan = new Scanner(System.in);

	n[0] = scan.nextInt();
	n[1] = scan.nextInt();
	n[2] = scan.nextInt();
	
	mid = n[0]+n[1]+n[2];
	
	min = (n[1] < n[2]) ? n[1] : n[2];
	min = (n[0] < min) ? n[0] : min;
	
	max = (n[1] < n[2]) ? n[2] : n[1];
	max = (n[0] < max) ? max : n[0];
	
	mid = mid - (min + max);

	System.out.println(min + " " + mid + " " + max);

	scan.close();
	
	}
}