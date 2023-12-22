import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong(),
				B=(long)(sc.nextFloat()*100);
      long ans =A*B/100;
		
		System.out.println(ans);
	}
}