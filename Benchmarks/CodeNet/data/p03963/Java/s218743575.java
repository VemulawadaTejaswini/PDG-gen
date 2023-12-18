import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int Ball = sc.nextInt();
	    int Penki = sc.nextInt();
	    int answer = Penki;

	    for (int i = 0; i < Ball - 1; i++) {
	    	answer = answer * (Penki - 1);
	    }
	    System.out.println(answer);

	}

}