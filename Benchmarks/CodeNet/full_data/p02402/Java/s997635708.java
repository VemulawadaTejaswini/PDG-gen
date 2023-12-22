import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		String[] num_str = str.split(" ");
		int[] num = new int[10000];
		int min = 0;
		int max = 0;
		long sum = 0;

		for(int i = 0; i < n; i++){
			num[i] = Integer.parseInt(num_str[i]);
			sum += num[i];
			if(i == 0){
				min = num[i];
				max = num[i];
			}
			if(num[i] < min){
				min = num[i];
			}
			if(max < num[i]){
				max = num[i];
			}
		}
		System.out.println(min + " "+ max + " "+ sum);
	}
}
