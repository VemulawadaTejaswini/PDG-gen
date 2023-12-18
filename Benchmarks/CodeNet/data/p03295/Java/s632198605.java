import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] table = new int[m][2];
		for(int i = 0; i < m; i++) {
			table[i][0] = sc.nextInt();
			table[i][1] = sc.nextInt();
		}
		List<int[]> list = Arrays.stream(table).sorted((a1, a2) -> a1[1] - a2[1]).collect(Collectors.toList());
		Set<Integer> c  =new HashSet<>();
		for(int[] array : list) {
			boolean b = false;
			for(int i : c)
				b |= array[0] <= i && i < array[1];
			if(b)
				continue;
			c.add(array[1]-1);
		}
		System.out.println(c.size());
	}
}