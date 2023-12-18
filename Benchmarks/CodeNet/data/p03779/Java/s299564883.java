import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int n  = in.nextInt();
		int sum = 0;
		
		for(int i = 1; i < n; i++){
			sum += i;
			if(sum >= n){
				System.out.println(i);
				break;
			}
		}
	}
}