
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum[]=new int[2];
		for(int i=0;i<4;i++){
			sum[0]+=sc.nextInt();
		}
		for(int i=0;i<4;i++){
			sum[1]+=sc.nextInt();
		}
		if(sum[1]<=sum[0]){
			System.out.println(sum[0]);
		}
		else{
			System.out.println(sum[1]);
		}
	}
}