import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(Sx2dx(sc.nextInt(), 600));
		}
		sc.close();
		
	}
	
	static int sq(int x) {
		return x * x;
	}
	
	static int Sx2dx(int d, int width) {
		int result = 0;
		for(int i = 0; i < width / d ; i++) {
			result += sq(d * i) * d;
		}
		return result;
	}
}