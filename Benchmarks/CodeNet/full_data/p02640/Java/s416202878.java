import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			
			int total = sc.nextInt();
			int reg = sc.nextInt();
			
			
			double ykamo = (reg-total)/6;
			if(ykamo*100 % 100 != 0){
				System.out.println("No");
			}else{
				int y = (reg-total)/6;
				int x = total-y;
				
				if(0 <= y && 0 <= x ){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}catch(Exception e){
			System.out.println("No");
		}
	}
}