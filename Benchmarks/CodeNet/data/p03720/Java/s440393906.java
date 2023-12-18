import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer city=Integer.valueOf(sc.nextLine().split(" ")[0]);
		int[] road=new int[city];

		while (sc.hasNextLine()) {
			Integer[] roadInfo=Arrays.asList(sc.nextLine().split(" "))
					.stream()
					.map(Integer::valueOf)
					.toArray(Integer[]::new);
			road[roadInfo[0]-1]++;
			road[roadInfo[1]-1]++;
		}
		for(Integer i:road) {
			System.out.println(i);
		}
	}
}