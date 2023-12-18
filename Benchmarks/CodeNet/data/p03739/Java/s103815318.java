import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num_count = sc.nextInt();
		int[] numbers = new int[num_count];

		for(int i = 0;i < numbers.length;i++){
			numbers[i] = sc.nextInt();
		}

		int res = 0;

		int id = 0;

		do{
			boolean flag = true;
			int sum = 0;
			int pre_sum = 0;
			int i;
			for(i = 0;i < numbers.length;i++){
				sum += numbers[i];

				if(pre_sum > 0 && sum > 0){
					flag = false;
					break;
				}
				if(pre_sum < 0 && sum < 0){
					flag = false;
					break;
				}
				if(sum == 0){
					flag = false;
					break;
				}

				pre_sum = sum;
			}
			if(flag)break;

			if(sum > 0){
				numbers[i] -= sum + 1;
				res += sum + 1;
			}else{
				numbers[i] -= sum - 1;
				res += -sum + 1;
			}
		}while(true);

		System.out.println(res);

		sc.close();

	}

}
