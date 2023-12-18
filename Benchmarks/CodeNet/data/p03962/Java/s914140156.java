import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashSet<Integer> lista = new HashSet<Integer>();
		for(int i =0; i < 3; i++) {
			lista.add(scan.nextInt());
		}
        System.out.println(lista.size());
	}
}