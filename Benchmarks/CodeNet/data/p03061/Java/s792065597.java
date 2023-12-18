import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int[] numbers = new int[number];
		Calc calc = new Calc();
		
		for(int i=0;i<number;i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int start=calc.gcdAll(numbers,1,number-1);
		int end=calc.gcdAll(numbers,0,number-2);
		int max = start>end?start:end;
		for(int i=1;i<number-1;i++) {
			int gcd = calc.gcd(calc.gcdAll(numbers,0,i-1),calc.gcdAll(numbers,i+1,number-1));
			if(max < gcd)
				max = gcd;
		}
		System.out.println(max);
	}
}



class Calc{
	int gcd(int a,int b) {
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
	}
	
	int gcdAll(int[] numbers,int start,int end) {
		if(end - start == 0)
			return numbers[start];
		else
			return gcd(gcdAll(numbers,start,end-1),numbers[end]);
	}
}