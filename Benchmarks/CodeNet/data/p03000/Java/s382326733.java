import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;

public class Main {

	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] strArray1 = line.split(" ");
		int[] array1 = new int[2];
		for(int i = 0; i < 2; i++){
			array1[i] = Integer.parseInt(strArray1[i]);
		}

		line = readLine();
		String[] strArray2 = line.split(" ");
		int[] array2 = new int[array1[0]];

		for(int i = 0; i < array1[0]; i++){
			array2[i] = Integer.parseInt(strArray2[i]);
		}

		int sum = 0;
		for(int i = 0; i < array1[0]; i++){
			sum += array2[i];
			if(sum > array1[1]){
				System.out.println(i+1);
				break;
			}
		}
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}