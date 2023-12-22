import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int[][] nums = new int[3000][2];
		int temp;
		int count = 0;
		Scanner s = new Scanner(System.in);
		for(int i =0;i<3000;i++) {
			nums[i][0] = s.nextInt();
			nums[i][1]= s.nextInt();
			if(nums[i][0]>=0 && nums[i][1]>=0 && nums[i][0]<=10000 && nums[i][1]<=10000) {
			if(nums[i][0]>nums[i][1]) {
				temp = nums[i][0];
				nums[i][0] = nums[i][1];
				nums[i][1] = temp;
				
			}
			if(nums[i][0]==0 && nums[i][1]==0) {
				count = i;
				break;
			}
			}
		}
		
		for(int j=0;j<count;j++) {
			System.out.println(nums[j][0]+" "+nums[j][1]);
		}
	}

}