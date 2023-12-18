import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int NumberOfDigits = 0;
		for (;NumberOfDigits  <= 3 ; NumberOfDigits++){
			if (b/(int)Math.pow(10,NumberOfDigits) < 10) break;
		}
		int sum = a * (int)Math.pow(10, NumberOfDigits + 1) + b;
		System.out.println(sum);
		for(int i = 0 ; i <= 100 ; i++){
			if (i == 100 && i*i == sum){
				System.out.println("Yes");
				break;
			}else if(i*i == sum){
				System.out.println("Yes");
				break;
			}else if(i == 100){
				System.out.println("No");
			}
		}
		
	}
}
