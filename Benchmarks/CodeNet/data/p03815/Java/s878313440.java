import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		if(x<=6){
			System.out.println("1");
		}
		else if(x<=11){
			System.out.println("2");
		}
		else{
			long p = x/11;
			long q = x%11;

			if(q == 0){
				System.out.println(p*2);
			}
			else{
				System.out.println(p*2+1);
			}
		}
	}
}
