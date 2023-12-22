import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		for(int i = 0; i < times; i++){
			int[] nums = new int[3];
			for(int j=0; j < nums.length; j++){
				nums[j]=sc.nextInt();
			}
			if(isCRight(nums[0],nums[1],nums[2]) || isCRight(nums[1], nums[2],nums[0]) || isCRight(nums[2], nums[0],nums[1])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	private static boolean isCRight(int a, int b, int c){
		return a*a + b*b ==c *c;
	}
}