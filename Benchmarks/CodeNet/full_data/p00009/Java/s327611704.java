
import java.util.Scanner;

class Main{
    public static void main(String[] a){
			Scanner input = new Scanner(System.in);
			
			int ctr = 0;
			int primectr = 0;
			int remainder = 0;
			while ((input.hasNextInt()) && ctr < 30) {
				int num = input.nextInt();
				int tempnum = num;
				primectr = 0;
				if (num > 1){
					primectr = 1;
				}
				for (int y = tempnum; y > 2; y--){
					for (int x = 2; x <= y; x++){
						remainder = y % x;
						if (remainder == 0) {
							break;
						}else{
							if (x + 1 == y){
								primectr = primectr + 1;
								
							}
						}
					
					}
					
					ctr = ctr + 1;
				}
				System.out.println(primectr);
			}	
			input.close();
		
	}
}