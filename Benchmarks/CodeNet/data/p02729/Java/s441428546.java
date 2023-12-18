
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.println(calcNumOfCombination(N, 2)+calcNumOfCombination(M, 2));

		}
	 public static int calcNumOfCombination(int n, int r){
	        int num = 1;
	        for(int i = 1; i <= r; i++){
	            num = num * (n - i + 1) / i;
	        }
	        return num;
	    }
}
