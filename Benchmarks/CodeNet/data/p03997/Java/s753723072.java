import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int topSide = Integer.parseInt(br.readLine());
			int bottomSide = Integer.parseInt(br.readLine());
			int height = Integer.parseInt(br.readLine());


			int areaOfaTrapezoid = getAreaOfaTrapezoid(topSide, bottomSide, height);

			System.out.println(areaOfaTrapezoid);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public static int getAreaOfaTrapezoid(int topSide, int bottomSide, int height) {
		
		// 台形の面積 =(上底 + 下底) × 高さ ÷	2
		// Area of a trapezoid = (top side + bottom side) * height / 2

		return (topSide + bottomSide) * height / 2;
	}
}