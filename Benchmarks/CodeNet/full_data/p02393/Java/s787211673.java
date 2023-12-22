import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(Integer.valueOf(scanner.nextInt()));
        list.add(Integer.valueOf(scanner.nextInt()));
        list.add(Integer.valueOf(scanner.nextInt()));

        Collections.sort(list);

        for(int a : list){
            System.out.print(a + " ");
        }


	}
}