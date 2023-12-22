import java.util.Scanner;
class Main {
    public void kami() {
        		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double p = 3.141592653589;
		
		double r1 = r * r * p;
		double r2 = r * 2 * p;
		
		System.out.printf("%8.6f %8.6f \n", r1 , r2);

    }
	public static void main(String[] args) {
    new Main().kami();
	}

}