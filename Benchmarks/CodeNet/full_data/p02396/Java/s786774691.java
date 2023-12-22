import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {

		int num = 1;
		int[] nums = new int[10001];

		for(int j = 0; num > 0; j++) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));

			String str= br.readLine();
			num = Integer.parseInt(str);

			nums[j] = num;
		}

		for(int i=0 ; i<nums.length-1; i++) {
			System.out.println("Case"  +" " + (i+1)  +": " + nums[i]);
		}

	}

}