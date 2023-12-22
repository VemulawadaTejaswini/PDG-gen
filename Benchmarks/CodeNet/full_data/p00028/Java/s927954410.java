import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, mode = 0, hoge = 0;
		int nums[] = new int[100];

		for(int value: nums){
			value = 0;
		}

		while(hoge != 10){
			num = sc.nextInt();

			nums[num - 1]++;
			if(mode < nums[num -1]) mode = nums[num - 1];

			hoge++;
		}

		for(int i = 0; i < 100; i++){
			if(nums[i] == mode) System.out.println(i + 1);
		}
	}
}