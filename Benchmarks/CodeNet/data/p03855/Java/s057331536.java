import java.util.*;

public class Main {
	
	private static int nCity = 0;
	private static int kRoad = 0;
	private static int lRailways = 0;
	private static int[] citiesRoad;
	private static int[] citiesRailway;
	
			
	private static void connect(int[] arr, int p, int q) {
		int temp = arr[p];
		int val = arr[q];
		for (int i = 1; i <= nCity; i++) {
			if (arr[i] == temp) {
				arr[i] = q;
			}
		}
	}
	private static void input() {
		Scanner sc = new Scanner(System.in);
		nCity = sc.nextInt();
		kRoad = sc.nextInt();
		lRailways = sc.nextInt();
		
		citiesRoad = new int[nCity + 1];
		citiesRailway = new int[nCity + 1];
		for (int i = 1; i < (nCity + 1); i++) {
			citiesRoad[i] = i;
			citiesRailway[i] = i;
		}
		for (int i = 0; i < kRoad; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			connect(citiesRoad, p, q);
		}
		
		for (int i = 0; i < lRailways; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			connect(citiesRailway, p, q);
		}
	}
	
	private static void calculateRes() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String output = "";
		for (int i = 1; i <= nCity; i++) {
			int res = 0;
			for (int j = 1; j <= nCity; j++) {
				if (citiesRoad[i] == citiesRoad[j] && citiesRailway[i] == citiesRailway[j]) {
					res += 1;
				}
			}
			output = output + res + " ";
		}
		
		System.out.println(output.substring(0, output.length() - 1));
	}
	
	public static void main(String[] args) {
		input();	
		calculateRes();
	}
	
}
