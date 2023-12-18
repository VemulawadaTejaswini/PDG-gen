import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int P = Integer.parseInt(tokens[0]);
		int Q = Integer.parseInt(tokens[1]);
		int R = Integer.parseInt(tokens[2]);
		
		List<Integer> list = new ArrayList<>();
		list.add(P);
		list.add(Q);
		list.add(R);
		Collections.sort(list);
		System.out.println((list.get(0)+list.get(1)));
	}

}
