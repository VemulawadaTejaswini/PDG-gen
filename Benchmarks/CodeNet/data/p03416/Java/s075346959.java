import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int leng = 5;
		int nums[] = new int[leng];
		
		int st = sc.nextInt();
		int ed = sc.nextInt();
		int count = 0;
		
		for(int i=st ; i<=ed;i++){
			int num = i;
			for(int j=0;j<leng;j++){
				nums[j] = num / (int)Math.pow(10, leng-(j+1));
				num = num - nums[j] * (int)Math.pow(10, leng-(j+1));
			}
			
			if(nums[0] == nums[4] && nums[1] == nums[3]){
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}