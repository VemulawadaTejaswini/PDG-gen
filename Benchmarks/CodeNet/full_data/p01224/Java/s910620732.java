import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			for(int i = 1;i < n;i++){
				if(n % i == 0){
					sum+=i;
				}
				if(sum > n){
					System.out.println("abundant number");
					break;
				}
			}
			if(sum == n){
				System.out.println("perfect number");
			}else if(sum < n){
				System.out.println("deficient number");
			}
		}
	}
}