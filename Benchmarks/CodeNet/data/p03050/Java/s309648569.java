import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] nums = input.split(" ", 0);
			
			long N = Long.parseLong(nums[0]);
			long sum = 0;
			if(N<1 || 1_000_000_000_000l < N){
				return;
			}
			
			for(long m = 1l;m<N;m++){
				if(N/m == N%m){
					sum += m;
				}
			}
			
			System.out.println(sum);
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		} catch(InputMismatchException e){
			e.printStackTrace();
		}
	}
}