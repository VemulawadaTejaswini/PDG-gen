import java.util.Scanner;
class Main {
	public void ci(){
		Scanner sc = new Scanner(System.in);
		double r,S,O;
		r = sc.nextDouble();
		S = r * r * 3.141592653589;
		O = 2 * r * 3.141592653589;
		System.out.printf("%2.6f %2.6f\n",S,O);
	}
	public static void main(String[] args){
		new Main().ci();
	}
}