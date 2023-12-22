import java.util.*;

public class Main {
	
	static void print_dollor(int material_value, int topping_value, int num, int ans) {
		System.out.println(ans / (material_value + topping_value * num));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int topping_num = stdIn.nextInt();
		int money = stdIn.nextInt();
		int topping_value = stdIn.nextInt();
		int material_calorie = stdIn.nextInt(); //初期値として生地の値段を与える
		
		int[] data = new int[topping_num];
		int[] sum = new int[topping_num + 1];
		
		for(int r = 0; r < data.length; r++)
			data[r] = stdIn.nextInt();
		Arrays.sort(data); //後で修正
		for(int r = 0; r < data.length; r++) {
			sum[r + 1] = sum[r] + data[r];
		}
		int ans = -1, num = 0;
		for(int r = 1; r < sum.length; r++) {
			int psum = sum[sum.length - 1] - sum[r];
			if(psum > ans) {
				num = sum.length - 1 - r;
				ans = psum;
			}
		}
		ans += material_calorie;
		
		print_dollor(money, topping_value, num, ans);
		
	}

}