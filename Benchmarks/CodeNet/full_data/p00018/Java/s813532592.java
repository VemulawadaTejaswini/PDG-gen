import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] 	arrNbrLstStr = bufferedReader.readLine().split(" ");
		int[] 		arrNbrLst = new int[arrNbrLstStr.length];

		for(int i = 0; i < arrNbrLst.length; i++) arrNbrLst[i] = Integer.parseInt(arrNbrLstStr[i]);

		for(int i = 0; i < arrNbrLst.length - 1; i++) {
			for(int j = i + 1; j < arrNbrLst.length; j++) {
				if(arrNbrLst[i] < arrNbrLst[j]) {
					int tmp = arrNbrLst[i];
					arrNbrLst[i] = arrNbrLst[j];
					arrNbrLst[j] = tmp;
				}
			}
		}

		for(int val : arrNbrLst) System.out.print(val + " ");
	}

}
