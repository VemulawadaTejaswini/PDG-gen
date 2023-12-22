import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> queue = new ArrayDeque<String>();
		int count = 0;

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			queue.add(str[i]);
		}

		n = Integer.parseInt(br.readLine());
		String[] numList = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			while (queue.contains(numList[i])) {
				queue.removeFirstOccurrence(numList[i]);
				count++;
				}
			}
		System.out.println(count);
	}
}