import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		String num[] = nums.split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		String inputs = sc.nextLine();
		String input[] = inputs.split(" ");

		int count = 0;
		int sum = 0;
		for(int i = 0;i < input.length;i++){
			sum += Integer.parseInt(input[i]);
		}
		//System.out.println("sum = " + sum);

		//int popular = sum / (4 * M);
		double popular = (double)sum / (4 * M);
		//System.out.println("popular = " + popular);
		for(int i = 0;i < input.length;i++){
			if(Integer.parseInt(input[i]) >= popular){
				count++;
			}
		}

		if(count >= M){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}

class atcoder_20200404_2{
	public static void main(String args[]){
		new Main().main(args);
	}
}
