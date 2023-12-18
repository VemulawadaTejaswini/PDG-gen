import java.util.*;

class Main{
	public static void main(String[] args) throws java.lang.Exception{
		BufferdReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(
			Arrays.stream(input.split(""))
			.filter(i -> i.equals("1"))
			.count()
		);
	}
}