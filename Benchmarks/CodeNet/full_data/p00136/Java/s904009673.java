import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final double MAX_HEIGHT = 300.0;
	static final double[] heightTable = { 165.0, 170.0,
			175.0, 180.0, 185.0, MAX_HEIGHT };

	public static void main(String[] args) throws IOException{
		int[] studentHeightTable = createTable();
		for(int i = 0; i < studentHeightTable.length; i++){
			System.out.print((i + 1) + ":");
			for(int n = 0; n < studentHeightTable[i]; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int[] createTable() throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int numStudent = Integer.parseInt(br.readLine());
		int[] studentHeightTable = new int[heightTable.length];
		for (int i = 0; i < numStudent; i++) {
			double height = Double.parseDouble(br.readLine());
			for (int heightClass = 0; heightClass < heightTable.length; heightClass++) {
				if(height < heightTable[heightClass]){
					studentHeightTable[heightClass]++;
					break;
				}
			}
		}
		return studentHeightTable;
	}
}