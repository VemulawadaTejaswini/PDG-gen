import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int data = sc.nextInt();
			boolean[] noserufundo = tennbinn(data);
			StringBuilder ans = new StringBuilder();
			for (int i=0; i < noserufundo.length; i++) {
				if (noserufundo[i]) {
					ans.append(fundo[i] + " ");
				}
			}
			System.out.println(ans.toString().trim());
		}
	}

	public static final int[] fundo =
		{1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

	public static boolean[] tennbinn(int object) {
		int len = fundo.length;
		boolean[] noserufundo = new boolean[len];
		for (int i = len-1; 0 <= i && 0 < object; i--) {
			if (object - fundo[i] >= 0) {
				object = object - fundo[i];
				noserufundo[i] = true;
			}
		}
		return noserufundo;
	}
}