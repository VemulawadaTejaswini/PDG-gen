import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int n = sc.nextInt();
				int s = sc.nextInt();
				if(n == 0 && s == 0) break;
				int count = recfunc(0, 0, s, n);
				System.out.println(count);
			}
		}
	}

	//??±???????????¢?´¢
	public static int recfunc(int total, int plusNum, int targetNum, int n){
		if(plusNum >= 10) return 0;
		if(n <= 0) {
			if(total == targetNum) return 1;
			else return 0;
		}
		return recfunc(total + plusNum, plusNum + 1, targetNum,  n - 1) + recfunc(total, plusNum + 1, targetNum, n);
	}
}