	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isEnd = str == null;
		while (!isEnd) {
			long number = Long.parseLong(str);
			long[] list = new long[(int) number];
			list[0]=2;
			int count = 1;
			if (number == 1) {
			System.out.println("0");
			str = br.readLine();
			isEnd = str == null;
			continue;
			} else if (number == 2) {
				System.out.println("1");
				str = br.readLine();
				isEnd = str == null;
				continue;
			} else {
				for (int i = 3; i <= number; i = i + 2) {
					double rootI=Math.pow(i, 0.5);
					for (int j = 0;true; j++) {
						long prime = list[j];
						if (i % prime == 0) {
							break;
						} else if ((double) prime >= rootI) {
						list[count]=(long)i;
							count++;
							break;
						}
					}
				}
				System.out.println(count);
				str = br.readLine();
				isEnd = str == null;
			}
		}
	}
}