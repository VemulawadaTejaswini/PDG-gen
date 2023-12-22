public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		line = line.replace("apple","fujita-");
		line = line.replace("peach","ikeda-");
		line = line.replace("fujita-","peach");
		line = line.replace("ikeda-","apple");
		System.out.println(line);
	}
}