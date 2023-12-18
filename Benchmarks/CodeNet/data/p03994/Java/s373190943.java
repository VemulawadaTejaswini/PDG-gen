import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] array = sc.next().toCharArray();
		long K = sc.nextLong();
		for (int i=0; i<array.length&&K>0; i++) {
			int k = score(array[i]);
			if (K<k) continue;
			array[i] = 'a';
			K -= k;
		}
		if (K>0) {
			array[array.length-1] += K%26;
		}
		System.out.println(String.valueOf(array));
		sc.close();
	}
	
	public static int score(char c) {
		return (25-c+98)%26;
	}
}
