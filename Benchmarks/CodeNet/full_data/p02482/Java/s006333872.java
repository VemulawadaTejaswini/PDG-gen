public class Small {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			String line = reader.readLine();
			int a = Integer.parseInt(line);
			
			line = reader.readLine();
			int b = Integer.parseInt(line);
			if (a > b) {
				System.out.println("a > b");
			} else if (a == b) {
				System.out.println("a == b");
			} else {
				System.out.println("a < b");
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("??°????????¢????????£????????????????????????");
		}
	}
}