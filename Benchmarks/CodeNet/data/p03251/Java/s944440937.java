import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();		
		//2行目
		sc.nextLine();
		int numsX[] = new int[N]; 
		for(int nums:numsX){
			nums = sc.nextInt();
		}
		//3行目
		sc.nextLine();
		int numsY[] = new int[M]; 
		for(int nums:numsY){
			nums = sc.nextInt();
		}
		sc.close();
		Arrays.sort(numsX);
		Arrays.sort(numsY);
		int Z = numsY[0];
		
		if(Z>numsX[N-1] && X < Z &&Z <= Y){
			System.out.println("No ");
		}
		System.out.println("War");
			
	}
}