import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();


		double d=((double)(a+b)/2);
		int i=(a+b)/2;

		if(d==i){
			System.out.println(i);
		}else{
			System.out.println(i+1);
		}

	}
}
