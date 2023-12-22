import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Integer> hills = new ArrayList<Integer>();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0; i<10; ++i){
			hills.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(hills);

		System.out.println(hills.get(0));
		System.out.println(hills.get(1));
		System.out.println(hills.get(2));

	}
}