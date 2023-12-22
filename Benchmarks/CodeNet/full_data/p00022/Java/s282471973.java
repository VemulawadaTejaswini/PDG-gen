import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count = sc.nextInt();
			if (count == 0) break;
			
			boolean isPlus = false;
			int maxsum = Integer.MIN_VALUE;
			int sum2 = 0;
			for(int i = 0; i < count; i++){
				int in = sc.nextInt();
				boolean isThisPlus = (in > 0);
				isPlus = (i == 0) ? isThisPlus : isPlus;
				
				if (isThisPlus != isPlus){
					if (isThisPlus){
					// minus -> plus
					// evaluate whether to include the previous PLUS-MINUS sum
					// if the sum < 0 then that sum should not be included
						if(sum2 < 0){
							sum2 = 0;
						}
					}else{
					//plus -> minus
						maxsum = Math.max(maxsum, sum2);
					}
				}
				sum2 += in;
				isPlus = isThisPlus;
			}
			maxsum = Math.max(maxsum, sum2);
			System.out.println(maxsum);
		}
		sc.close();
	}
}