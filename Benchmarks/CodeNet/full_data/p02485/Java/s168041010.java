
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<Integer>();
		String input = null;
		while (!(input = reader.readLine()).equals("0")) {
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				sum+=perse(input.charAt(i));
			}
			list.add(sum);
		}
		for(int i:list){
			System.out.println(i);
		}

	}

	private static int perse(char num) {
		return num - '0';
	}
}