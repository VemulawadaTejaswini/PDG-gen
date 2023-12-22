import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] dl = new int[w];
		for(int i = 0; i < w; i++){
			dl[i] = i + 1;
		}
		for(int i = 0; i < n; i++){
			String enn = scan.nextLine();
			String input = scan.nextLine();
			String[] nums = input.split(",");
			int a = Integer.parseInt(nums[0]) - 1;
			int b = Integer.parseInt(nums[1]) - 1;
			int tmp = dl[a];
			dl[a] = dl[b];
			dl[b] = tmp;
		}
		for(int i = 0; i < w; i++){
			System.out.printf("%d\n", dl[i]);
		}
	}
}