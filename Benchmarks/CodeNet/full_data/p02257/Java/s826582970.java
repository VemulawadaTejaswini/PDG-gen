import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, num;
		int ct = 0, i, j, judge = 2;
		
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num = input.nextInt();
			if (num < 2){
				judge = 0;
			}
			else if (num == 2){
				judge = 1;
			}
			else if (num % 2 == 0){
				judge = 0;
			}
			for (j = 3; j * j <= num; j += 2){
				if (num % j == 0){
					judge = 0;
				}
			}
			if (judge != 0){
				judge = 1;
			}
			if (judge != 0){
				ct++;
			}
		}
		System.out.println(n - ct);
	}
}