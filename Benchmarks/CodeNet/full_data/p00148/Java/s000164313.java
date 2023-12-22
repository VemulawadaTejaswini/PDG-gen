import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.printf("3C%01d\n",(sc.nextInt())%39);
		}
	}
}