import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i< N;i++) {
			list.add(sc.nextInt());
		}
		int sum = list.stream().mapToInt(v->v).sum();
		ArrayList<Integer> sort = list.stream().sorted(Comparator.reverseOrder()).limit(M).collect(Collectors.toCollection(ArrayList::new));
		if(sort.get(M-1)<sum/4/M) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}