
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[] sort(int[] nums){
		for(int h=nums.length-1;h>0;h--){
			for(int i=1;i<=h;i++){
				if(nums[i]>nums[i-1]){
					int tmp=nums[i];
					nums[i]= nums[i-1];
					nums[i-1]=tmp;
				}
			}
		}
		return nums;
	}
	public static void main(String[] a) {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		try {
			//data set num
			str = br.readLine();
			int setNum=Integer.parseInt(str);
			for (int h = 0; h < setNum; h++) {
				int[] num = new int[3];
				str = br.readLine();
				String[] numbers =str.split(" ");
				for (int i = 0; i < numbers.length; i++) {
					num[i] = Integer.parseInt(numbers[i]);
				}
				num =sort(num);
				int answer = (int)Math.pow(num[1], 2)+(int)Math.pow(num[2], 2);
				if(answer==(Math.pow(num[0], 2))){
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}