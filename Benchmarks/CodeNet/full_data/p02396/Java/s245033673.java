import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrintTestCase {
	public static void main(String[] args)throws IOException {

		int num = 1;
		int[] nums = new int[10000];
		int j = 0;
		for(j = 0;j < 10000 && num > 0; j++) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));

			String str= br.readLine();
			num = Integer.parseInt(str);

			nums[j] = num;
			j++;
		}

		for(int i=0 ; i<j-1; i++) {
			System.out.println("Case"  +" " + (i+1)  +": " + nums[i]);
		}

	}

}