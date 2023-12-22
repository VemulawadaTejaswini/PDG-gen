import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			int length = Integer.parseInt(str);

			str = br.readLine();

			String[] dataSet = str.split(" ", 0);
			String[] dataSetReverse;
			dataSetReverse = new String[length];

			for (int i = 0; i < length; i++) {
				dataSetReverse[length - i -1] = dataSet[i];
			}
			for (int j = 0; j <= length -1; j++) {
				sb.append(dataSetReverse[j]);
				if(j != length -1){
				sb.append(" ");
				}
			}
			System.out.println(sb);
			str = br.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}