import java.util.Scanner;

class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			long num1 = sc.nextInt();
			long num2 = sc.nextInt();
			long divisor;
			long multiple;


	        for (multiple = 1; multiple <= num1 * num2; multiple++) {
	            if ((multiple % num1 == 0) && (multiple % num2 == 0)) {

	                break;
	            }
	        }

	        for (divisor = num1; divisor >= 1; divisor--) {
	            if ((num1 % divisor == 0) && (num2 % divisor == 0)) {
	                break;
	            }
	        }//for
	        System.out.printf("%d %d", divisor , multiple);
		}
	}
}