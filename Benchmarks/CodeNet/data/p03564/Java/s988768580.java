import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 1;
		for(int i=0; i<n; i++){
			result = (result * 2 < result + k) ? result * 2 : result + k;
		}
		System.out.println(result);
	}
}
