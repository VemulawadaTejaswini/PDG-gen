

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		int index = Integer.parseInt(br.readLine());
		String head = br.readLine();
		for(int i = 1;i < index;i++) {
			temp = br.readLine();
			if (head.compareTo(temp) > 0) {
				head = temp;
			}
		}
		System.out.println(head);
	}

}