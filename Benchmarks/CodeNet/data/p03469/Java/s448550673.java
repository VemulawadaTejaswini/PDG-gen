import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data[] = sc.nextLine().split("/",0);

		data[0] = "2018";

		System.out.println(data[0] + "/" + data[1] + "/" + data[2]);
	}
}
