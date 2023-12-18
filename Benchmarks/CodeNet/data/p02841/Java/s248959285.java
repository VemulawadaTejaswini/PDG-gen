import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner  first= new Scanner (System.in);
		String M1 = first.next();

		Scanner  second= new Scanner (System.in);
		String M2 = second.next();

		System.out.println(M1+M2);

		if(M1.equals(M2)) {
			System.out.println("0");
		}else{
			System.out.println("1");
		}
	}

}