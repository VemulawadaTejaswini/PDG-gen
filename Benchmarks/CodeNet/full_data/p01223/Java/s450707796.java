import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] height;
	static int exeption;
	static int block_number;
	public static void main(String[] args) {
		int number_of_dataSet = sc.nextInt();
		for(int i = 0; i < number_of_dataSet; i++){
			read();
		}
	}
	static int read(){
		block_number = sc.nextInt();
		if(block_number == 2){
			int object_1 = sc.nextInt(), object_2 = sc.nextInt();
			if(object_1 > object_2){
				System.out.println("0"+ " " + (object_1 - object_2));
			}else if(object_2 > object_1){
				System.out.println(object_2 - object_1 +" "+ "0");
			}else{
				System.out.println("0" + " " + "0");
			}
			return 0;
		}
		height = new int[block_number];
		for(int j = 0; j < block_number; j++){
			height[j] = sc.nextInt();
		}
		solve();
		return 0;
	}
	static void solve(){
		int []diff = new int[block_number - 1];
		for(int i = 0; i < block_number -1; i++){
			if(height[i] > height[i+1]){
				diff[i] = -(height[i] - height[i+1]);
			}else if(height[i] < height[i+1]){
				diff[i] = height[i + 1] - height[i];
			}else{
				diff[i] = 0;
			}
		}
		Arrays.sort(diff);
		if(block_number  != 2){
			System.out.println(diff[block_number - 2] +" "+ -(diff[0]));
		}else{

		}
	}
}