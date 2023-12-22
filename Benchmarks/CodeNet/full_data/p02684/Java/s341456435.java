import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer town = sc.nextInt();
		Long teleport = sc.nextLong();
		
		List<Integer> lists = new ArrayList<Integer>(town);
		for(int i = 0; i < town; i ++) {
			lists.add(sc.nextInt() - 1);
		}
		
		Integer nowTown = 0;
		for(int i = 0; i < teleport; i++) {
			nowTown = lists.get(nowTown);
		}
		System.out.println(nowTown + 1);
	}
}