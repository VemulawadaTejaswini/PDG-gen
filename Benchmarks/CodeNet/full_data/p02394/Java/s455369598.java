
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line0;
			line0 = stdReader.readLine();

			String Array[] = line0.split(" ");
			int x = Integer.parseInt(Array[0]);
			int y = Integer.parseInt(Array[1]);
			int W = Integer.parseInt(Array[2]);
			int H = Integer.parseInt(Array[3]);
			int r = Integer.parseInt(Array[4]);
			if ((x+r)<W&&(y+r)<H||(x-r)>0&&(y-r)>0) {
				System.out.println("Yes");
			} else{
				System.out.println("No");
			}
		} catch (

		Exception e) {
			e.getStackTrace();
			/* ??????´??????0?????? */
			System.exit(0);
		}
	}
}