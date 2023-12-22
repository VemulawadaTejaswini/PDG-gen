import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String nabe = "";

		for(int i = 3; i <= N ; i++){
			if ( i % 3 == 0 || Integer.toString(i).contains("3")) {

				nabe += (" " + i);
			}
		}
		System.out.println(nabe);
	}
}