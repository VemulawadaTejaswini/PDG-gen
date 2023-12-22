import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int n;
		while((n= sn.nextInt()) != 0){
			System.out.println(getNumberType(n));
		}
	}
	
	static String getNumberType(int n){
		if(n == 1) return "deficient number";
		int sum = 1;
		
		int range = n;
		for(int i = 2; i < range; i++){
			if(n%i == 0){
				range = n/i;
				sum += i;
				if(i  != range) sum += range; 
			}
		};
		return (sum == n)? "perfect number": (sum < n)? "deficient number": "abundant number";
	}
}