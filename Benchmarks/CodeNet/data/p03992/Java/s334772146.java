import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int num = System.in.read();
		int count = 0;
		int[] array = new int[num];
		for (int i = 1; i < num + 1; i++) {
			byte[] b = new byte[5];
			int a = System.in.read(b, 0, 5);
			array[i - 1] = a;
			if (i > a) {
				if (array[a - 1] == i) {
					count++;
				}
				else continue;
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(array[i]);
		}
		System.out.println(count);
	}
}