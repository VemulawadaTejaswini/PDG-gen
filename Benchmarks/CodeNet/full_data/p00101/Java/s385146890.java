import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int set;
		List<String>list = new ArrayList<String>();

		set = Integer.parseInt(bufferedReader.readLine());

		for(int i = 0; i < set; i++) list.add(bufferedReader.readLine().replaceAll("Hoshino", "Hoshina"));
		for(String value: list)System.out.println(value);


	}

}