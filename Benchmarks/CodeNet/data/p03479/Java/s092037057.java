import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double  x= sc.nextDouble();
		Double y = sc.nextDouble();
		int count = 0;
		Double z = y/x;
		while(z >= Math.pow(2,count-1)) {
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}