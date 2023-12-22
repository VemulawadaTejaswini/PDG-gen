import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int ice;
		int[] a = new int[10];
		
		while(true){
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++){
				ice = scan.nextInt();
				a[ice]++;
			}
			for(int i = 0; i < 10; i++){
				if(a[i] > 0){
					for(int j = 0; j < a[i]; j++){
						System.out.print("*");
					}
				}else System.out.print("-");
				System.out.println();
			}
		}
	}
}