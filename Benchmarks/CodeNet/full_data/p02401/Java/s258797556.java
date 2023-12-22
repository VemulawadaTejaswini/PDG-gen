import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int numA = 0;
		int numB = 0;

		int Anser = 0;

		String op = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//???????????????
			while(true){
				String line = br.readLine();

				if (line != null) {
					String[] InputList = line.split(" ", 0);

					numA = Integer.parseInt(InputList[0]);
					numB = Integer.parseInt(InputList[2]);
					op = InputList[1];

					if (op != null) {
						switch (op) {
							case "+":
								System.out.println(numA + numB);
								break;

							case "-":
								System.out.println(numA - numB);
								break;

							case "*":
								System.out.println(numA * numB);
								break;

							case "/":
								System.out.println(numA / numB);
								break;

							default:
								break;
						}
					}else{
						System.out.println("E");
						break;
					}
				}else{
					System.err.println("R");
					break;
				}
			}

		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}