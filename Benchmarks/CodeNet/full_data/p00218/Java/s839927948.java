
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			for(int i = 0;i<N;i++){
				System.out.println(c(cin.nextInt(),cin.nextInt(),cin.nextInt()));
			}
		}
	}
	static String c(int m,int e,int j){
		if(m==100||e==100||j==100){
			return "A";
		}
		if(m+e>=180){
			return "A";
		}
		if(m+e+j>=240){
			return "A";
		}
		if(m+e+j>=210){
			return "B";
		}
		if(m+e+j>=150&&(m>=80||e>=80)){
			return "B";
		}
		return "C";
	}
	
}