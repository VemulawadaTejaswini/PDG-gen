import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		boolean flag = true;
		int counter = 0;
		for(int i = 0; flag; i++){
			flag = false;
			for(int j = n - 1; i + 1 <= j; j--){
				if(array[j] < array[j-1]){
					int v = array[j-1];
					array[j-1] = array[j];
					array[j] = v;
					flag = true;
					counter++;
				}
			}
		}

		StringJoiner sj = new StringJoiner(" ");
		Arrays.stream(array).forEach(v -> sj.add(String.valueOf(v)));
		System.out.println(sj);
		System.out.println(counter);
	}
}

