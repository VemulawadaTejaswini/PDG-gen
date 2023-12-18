import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] nums = new String[num];
		nums = br.readLine().split(" ");
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<num; i++){
			numList.add(Integer.parseInt(nums[i]));
		}
		for(int i=0; i<num-2; i++){
			numList.set(0,numList.get(0)+numList.get(1));
			numList.set(2,numList.get(1)+numList.get(2));
			numList.remove(1);
		}
		System.out.println(numList.get(0)+numList.get(1));
	}
}
