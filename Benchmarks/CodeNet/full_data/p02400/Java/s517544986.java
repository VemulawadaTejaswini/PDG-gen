import java.util.Scanner;
class Main {
    public void kami() {
                Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double p = 3.141592653589;
		
		double r1 = r * r * p;
		double r2 = r * 2 * p;
		
		System.out.printf("%f %1f", r1 , r2);

    }
	public static void main(String[] args) {
    new Main().kami();
	}

}