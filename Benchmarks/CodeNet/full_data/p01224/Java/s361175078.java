import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int i = sc.nextInt();
			
			if(i == 0){
				break;
			}
			
			int s = getSumOfD(i);
			
			if(i == s){
				System.out.println("perfect number");
			}else{
				if(i < s){
					System.out.println("abundant number");
				}else{
					System.out.println("deficient number");
				}
			}
		}
	}

	private static int getSumOfD(int c){
		int s = 0;
		
		for(int i = 1; i <= (c/2); i++){
			if(c % i == 0){
				s = s + i;
			}
		}
		return s;
	}
}