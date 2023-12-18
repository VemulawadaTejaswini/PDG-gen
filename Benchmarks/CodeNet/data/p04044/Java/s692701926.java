import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String [] line=in.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int l = Integer.parseInt(line[1]);
		ArrayList<String> listOfString = new ArrayList<>();

		for (int i = 0; i <n; i++) {
			listOfString.add(in.readLine());
		}
		
		Collections.sort(listOfString);
		StringBuilder result=new StringBuilder();
		listOfString.forEach(value->result.append(value));
		
		System.out.println(result);

	}
}
