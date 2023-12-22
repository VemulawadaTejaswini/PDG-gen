import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		for (String s : Arrays.asList(br.readLine().trim().split("\\s+"))) list.add(Integer.parseInt(s));

		int a = list.get(0), b = list.get(1);

		System.out.println(""+(a*b)+" "+(2*a+2*b));
	}
}