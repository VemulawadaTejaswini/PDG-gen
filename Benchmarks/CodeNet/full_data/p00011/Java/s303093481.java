import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();

		int[] array = new int[w];
		for(int i = 0; i < w; i++){
			array[i] = i + 1;
		}
		for(int i = 0; i < n; i++){
			String[] split = sc.next().split(",", 0);
			int a = Integer.valueOf(split[0]) - 1;
			int b = Integer.valueOf(split[1]) - 1;
			int tmp = array[a];
			array[a] = array[b];
			array[b] = tmp;
		}

		for(int i = 0; i < w; i++){
			System.out.println(array[i]);
		}

	}
}