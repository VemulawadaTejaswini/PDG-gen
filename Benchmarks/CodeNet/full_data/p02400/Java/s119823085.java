import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = Math.PI*r*r;
		double length = Math.PI*r*2;
		System.out.printf("%f %f%n",area,length);
	}
}
