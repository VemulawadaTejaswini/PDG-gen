import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int count = DFS(0, 0, s, n);
			System.out.println(count);
		}
	}

	public static int DFS(int total, int plusNum, int targetNum, int n){
		if(plusNum >= 10) return 0;
		if(n <= 0) {
			if(total == targetNum) return 1;
			else return 0;
		}
		return DFS(total + plusNum, plusNum + 1, targetNum,  n - 1) + DFS(total, plusNum + 1, targetNum, n);
	}
}