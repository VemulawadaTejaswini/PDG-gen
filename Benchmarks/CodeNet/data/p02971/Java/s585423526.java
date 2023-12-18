import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] nums = new int[num];
		for(int i=0;i<num;i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		int max=0;
		for(int i=0;i<num;i++) {
			max=0;
			for(int j=0;j<num;j++) {
				if(j!=i){
					if(max<nums[j]){
						max = nums[j];
					}
				}
			}
			System.out.println(max);
		}
	}
}
