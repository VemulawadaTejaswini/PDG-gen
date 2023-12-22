import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(reader.readLine());
			String[] numData = reader.readLine().split(" ");
			outputMinMaxTotal(numData);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void outputMinMaxTotal(String[] numData) {

		int min = 1000000;
		int max = -1000000;
		long total = 0;
		for(int i=0;i<numData.length;i++){
			int target = Integer.parseInt(numData[i]);
			if(min > target){
				min = target;
			}
			if(max < target){
				max = target;
			}
			total = total + target;
		}
		System.out.println(min + " " + max + " " + total);

	}

}