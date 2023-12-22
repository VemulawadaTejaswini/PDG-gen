import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			
			
			int[] mods = new int[q];
			Arrays.fill(mods, -1);
			
			int cur = p * 10;
			int rep_start = -1;
			int rep_end = 0;
			while(true){
				final int m = cur % q;
				System.out.print(cur / q);
				
				
				if(m == 0){
					rep_start = rep_end;
					break;
				}else if(mods[m] >= 0){
					rep_start = mods[m];
					break;
				}else{
					mods[m] = rep_end;
				}
				
				rep_end++;
				cur = m * 10;
			}
			
			System.out.println();
			if(rep_start != rep_end){
				for(int i = 0; i <= rep_end;i++){
					if(i <= rep_start){
						System.out.print(" ");
					}else{
						System.out.print("^");
					}
				}
				System.out.println();
			}
		}

	}

}