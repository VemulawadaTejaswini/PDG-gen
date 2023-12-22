import java.util.Scanner;
class Circle {
	public void ci(){
		Scanner sc = new Scanner(System.in);
		double r = 0 , S = 0 , O = 0;
		r = sc.nextDouble();
		S = r * r * 3.141592653589;
		O = 2 * r * 3.141592653589;
		System.out.printf("%2.6f %2.6f",S,O);
	}
	public static void main(String[] args){
		new Circle().ci();
	}
}