public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(reader.readLine());
			int b = Integer.parseInt(reader.readLine());
			int h = Integer.parseInt(reader.readLine());
			System.out.println((a + b) * h / 2);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}