import java.util.Scanner;

public class test{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] split = sc.nextLine().split(" ");
		
		int A = Integer.parseInt(split[0]);
		int B = Integer.parseInt(split[1]);
		int C = Integer.parseInt(split[2]);
		
		int count = 0;
		
		for(int i = A; i <= B; i+=A) {
			if(count < C) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}