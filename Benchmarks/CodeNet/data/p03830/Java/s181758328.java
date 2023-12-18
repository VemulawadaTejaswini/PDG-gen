import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();

		double sum = 1;
		for(double  i = 1;i <= N;i++){
			sum *= i;
		}
		double count = 0;
		for(double i = 1;i <= sum;i++){
			if(sum % i == 0 ) count++;
		}
		count %= (1000000007);
		System.out.println(count);
		
	}
}

