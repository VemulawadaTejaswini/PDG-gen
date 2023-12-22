import java.io.*;

class Main {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));// ??\????????????????????????
			String line;

			// ????????????????????´?????????
			// String line; // ??\???????????????????????\???
			// while ((line = br.readLine()) != null) {
			// processLine(line);
			// }

			calc: while ((line = br.readLine()) != null) {
				String[] fruit = line.split(" ");
				int nUm1 = Integer.valueOf(fruit[0]);
				String ope = fruit[1];
				int nUm2 = Integer.valueOf(fruit[2]);
				
				switch (ope) {
				case "+":
					System.out.println(nUm1 + nUm2);
					break;
				case "-":
					System.out.println(nUm1 - nUm2);
					break;
				case "*":
					System.out.println(nUm1 * nUm2);
					break;
				case "/":
					System.out.println(nUm1 / nUm2);
					break;
				case "?":
					break calc;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// private static void processLine(String line) {
	// System.out.println(line);
	// }
}