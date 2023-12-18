import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int[] tasks = new int[N];
		int[] deadLines = new int[N];
		boolean[] isFinished = new boolean[N];


		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < N; i++) {


			int A = s.nextInt();
			int B = s.nextInt();
			if(map.containsKey(B)) {
				map.put(B, map.get(B) + A);
			}else {
				map.put(B, A);
			}

		}


		int taskSum = 0;

		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {

			System.out.println(entry);
			taskSum += entry.getValue();
			if(taskSum > entry.getKey()) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}


	/*
	public static int getMinIndex(int[] array, boolean[] isFinished ) {

		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0;i<array.length;i++) {

			if(isFinished[i]) continue;

			if(array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}

		return minIndex;

	}*/
}
