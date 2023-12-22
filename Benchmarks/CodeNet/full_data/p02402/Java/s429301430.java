import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int set_count = in.nextInt();
		int min = 0;
		int max = 0;
		long sum = 0;

		for(int i = 0; i < set_count; i++){
			int num = in.nextInt();
			if(i == 0){
				min = num;
				max = num;
			}else{
				min = Math.min(min, num);
				max = Math.max(max, num);
			}
			sum += num;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}

