import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int W = scanner.nextInt();
		scanner.nextLine();

		List<Integer> darkX = new ArrayList<>();
		List<Integer> darkY = new ArrayList<>();

		List<Integer> whiteX = new ArrayList<>();
		List<Integer> whiteY = new ArrayList<>();

		for (int y = 0; y < H; y++) {
			String s = scanner.nextLine();
			char[] chars = s.toCharArray();
			for (int x = 0; x < chars.length; x++) {
				if (chars[x] == '#') {
					darkX.add(x);
					darkY.add(y);
				}else{
					whiteX.add(x);
					whiteY.add(y);
				}
			}
		}

		int answer = 0;
		for(int i = 0;i<whiteX.size();i++){
			int x = whiteX.get(i);
			int y = whiteY.get(i);
			int distance = getDistance(x, y, darkX, darkY);
			answer = Math.max(answer, distance);
		}
		System.out.println(answer);

	}

	public static int getDistance(int x, int y, List<Integer> darkX, List<Integer> darkY){

		int distance = Integer.MAX_VALUE;

		for(int i =0;i<darkX.size();i++){
			int targetX = darkX.get(i);
			int targetY = darkY.get(i);

			int d = Math.abs(targetX - x) + Math.abs(targetY - y) ;

			distance = Math.min(distance, d);
		}

		return distance;

	}
}
