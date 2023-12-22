import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		int a;
		int b = 0;
		Scanner data1 = new Scanner(System.in);
	    a = data1.nextInt();
	    b = data1.nextInt();
		int area;
		int total;
		area = (a * b);
		total = ((a + b) * 2);
		System.out.println(area + " " + total );
	}

}