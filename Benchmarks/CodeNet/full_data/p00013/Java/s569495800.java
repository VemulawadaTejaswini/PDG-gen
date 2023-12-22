

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<Integer>();
		String line;
		while ((line = br.readLine()) != null) {
			int num = Integer.parseInt(line);
			if (num == 0) {
				System.out.println(deque.removeLast());
			} else {
				deque.addLast(num);
			}
		}
	}

}