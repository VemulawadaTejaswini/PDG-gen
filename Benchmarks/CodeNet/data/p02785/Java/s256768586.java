import java .util.ArrayList;
import java.util.Collections;
import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int inputN = sc.nextInt();
	int inputK = sc.nextInt();

	ArrayList<Integer>  inH = new ArrayList<>();

	int attack = 0;

	for(int i = 0; i < inputN; i++) {
		inH.add(sc.nextInt());
	}

	Collections.sort(inH);

	for(int i = inputK; i < inH.size(); i++) {
		attack += inH.get(i);
	}

	System.out.println(attack);

}
}