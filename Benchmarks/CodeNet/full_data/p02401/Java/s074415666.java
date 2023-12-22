import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int NumA = 0;
		int NumB = 0;

		String line = null;
		String op = null;

		try {
			//??\???????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				line = br.readLine();

				if (line != null) {

					//???????????????????????????
					String[] NumList = line.split(" ", 0);

					//????????°?????£??\
					NumA = Integer.parseInt(NumList[0]);
					NumB = Integer.parseInt(NumList[2]);
					op   = NumList[1];

					//???????¢??????¨
					//System.out.println(NumA + op + NumB);

					//?????????????
					if (!op.equals("?")) {

						//????????????
						switch (op) {
						case "+":
							System.out.println(NumA + NumB);
							break;

						case "-":
							System.out.println(NumA - NumB);
							break;

						case "*":
							System.out.println(NumA * NumB);
							break;

						case "/":
							System.out.println(NumA / NumB);
							break;

						default:
							System.out.println("other");
							break;
						}
					}else{
						break;
					}
				}else{
					//System.out.println("END");
					break;
				}
				//System.out.println("???");
			}

		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}