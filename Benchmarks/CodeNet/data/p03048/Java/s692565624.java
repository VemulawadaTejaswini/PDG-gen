import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] nums = input.split(" ", 0);
			
			int R = Integer.parseInt(nums[0]);
			int G = Integer.parseInt(nums[1]);
			int B = Integer.parseInt(nums[2]);
			int N = Integer.parseInt(nums[3]);
			int combinations = 0;
			
			if(R<1 || 3000<R){
				return;
			}
			if(G<1 || 3000<G){
				return;
			}
			if(B<1 || 3000<B){
				return;
			}
			if(N<1 || 3000<N){
				return;
			}
			
			for(int r = 0;r*R <= N; r++){
				int rR = r*R;
				for(int g = 0; rR + g*G <= N; g++){
					int rRgG = rR + g*G;
					for(int b = 0; rRgG + b*B <= N; b++){
						if(r*R + g*G + b*B == N){
							combinations++;
						}
					}
				}
			}
			
			System.out.println(combinations);
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}