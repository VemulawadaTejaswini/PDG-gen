import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		ArrayList<Integer> List = new ArrayList<Integer>();

		try {
			for (int i=0;i<10;i++) {
				String buf = br.readLine();
				List.add(Integer.parseInt(buf));
			}
			Collections.sort(List);
			Collections.reverse(List);
			for (int i=0;i<3;i++) {
				System.out.println(List.get(i));
			}

		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}