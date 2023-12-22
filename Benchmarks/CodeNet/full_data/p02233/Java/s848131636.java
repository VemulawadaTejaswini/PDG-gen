import java.util.Scanner;

class fibonacci{
    
    static int[] memo = new int[45];
    
    int fib(int n){
	if(n == 0 || n == 1) return 1;
	if(memo[n] != -1) return memo[n];
	return memo[n] = fib(n - 2) + fib(n - 1);
    }
}

public class Main{
    public static void main(String[] args){

	fibonacci f = new fibonacci();

	for(int i = 0; i < 45; i++){
	    f.memo[i] = -1;
	}

	int n = new Scanner(System.in).nextInt();

	System.out.println(f.fib(n));

    }
}

