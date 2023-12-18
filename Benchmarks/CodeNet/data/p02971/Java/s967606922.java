import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		ArrayList<Integer>arr = new ArrayList<>();
		for(int i = 0;i<size;i++)arr.add(sc.nextInt());
		for(int i = 0;i<size;i++) {
			int temp = arr.get(i);
			arr.remove(i);
			System.out.println(Collections.max(arr));
			arr.add(i,temp);
		}

	}

}
