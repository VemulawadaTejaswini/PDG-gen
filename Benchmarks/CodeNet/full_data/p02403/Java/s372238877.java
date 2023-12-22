import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int numH = 0;
		int numW = 0;

		String sel = "#";

		String[] NumWork;

		try {
			//??\????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String line = br.readLine();

				if (line != null) {

					//??°??£?????´??°?????????
					NumWork = line.split(" ", 0);

					//??´??°?????°??????
					ArrayList<Integer> NumList = new ArrayList<Integer>();

					for (int i = 0; i < NumWork.length; i++) {
						NumList.add(Integer.parseInt(NumWork[i]));
					}
					numH = NumList.get(0);
					numW = NumList.get(1);

					//????????¢?????????
					//????????????
					if (numH != 0 || numW != 0) {

						for (int i = 0; i < numH; i++) {
							//
							for (int j = 0; j < numW; j++) {
								System.out.print(sel);
							}
							System.out.println("");
						}
						System.out.println("");
					}else{
						break;
					}
				}else{
					break;
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}