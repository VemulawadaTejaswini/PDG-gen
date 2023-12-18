import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		switch (str1 + str2){
			case("HH"):System.out.println("H"); 
			case("DH"):System.out.println("D"); 
			case("HD"):System.out.println("D"); 
			case("DD"):System.out.println("H"); 
		}

	}
}