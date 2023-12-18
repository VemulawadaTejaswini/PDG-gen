import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a = sc.next();
		String b = "ABS";
		
	if(a.equals(b)) {
		System.out.println("ARC");
	}else {
		System.out.println("ABS");
	}
	sc.close();
	}
    }