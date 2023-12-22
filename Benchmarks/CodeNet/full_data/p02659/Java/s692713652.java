import java.util.Scanner;

public class ABC169C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long A = sc.nextLong();
      	double B = sc.nextDouble();
		
      	int b = B * 100;
      
      	long result =(long) Math.floor(A * b);
		
		System.out.println(result/100);

	}
}