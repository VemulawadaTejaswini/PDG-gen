import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		int[] numsInt = new int[2];
		numsInt[0] = Integer.parseInt(nums[0]);
		numsInt[1] = Integer.parseInt(nums[1]);
		int max = numsInt[0] + numsInt[1];
		if(max < numsInt[0] - numsInt[1]){
			max = numsInt[0] - numsInt[1];
		}
		if(max < numsInt[0] * numsInt[1]){
			max = numsInt[0] * numsInt[1];
		}
		System.out.println(max);
	}
}
