
public class Main{
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 9 && j == 9) {
					System.out.print(i + "??" + j + "=" + (i * j));
				} else {
					System.out.println(i + "??" + j + "=" + (i * j));
				}
			}
		}
	}
}