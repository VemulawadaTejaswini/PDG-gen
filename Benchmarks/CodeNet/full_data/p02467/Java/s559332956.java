import java.util.Scanner;
public class Main{
    public static boolean isPrime(long n){
	if(n % 2 == 0)
		return false;
        for(int i = 3 ; i <= Math.sqrt(n) ; i+= 2){
		if(n % i == 0)
			return false;
	}
	return true;
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isPrime(n))
            System.out.println(n + ": " + n);
        else{
            System.out.print(n + ":");
            while(n % 2 == 0){
		System.out.print(" " + 2);
		n /= 2;
	    }
	    for(int i = 3 ; i <= Math.sqrt(n) ; i += 2){
		if(n % i == 0 && isPrime(i)){
			while(n % i == 0){
				System.out.print(" " + i);
				n /= i;
			}
		}
		if(n == 1)
			break;
		else if(isPrime(n)){
			System.out.print(" " + n);
			break;
		}
	    }
            System.out.println();
	}
    }
}
