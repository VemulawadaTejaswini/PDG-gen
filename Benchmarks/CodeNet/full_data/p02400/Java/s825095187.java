import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p = (float) Math.PI;
		Scanner sc = new Scanner(System.in);
		float hankei = sc.nextFloat();
		float area = hankei * hankei * p;
		float circum = 2 * hankei * p;
		System.out.println(area + " " + circum);
	}

}