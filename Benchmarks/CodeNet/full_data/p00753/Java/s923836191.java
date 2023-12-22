import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	
	int i = 0;
	int[] read = new int[123456];

	while(stdin.hasNext()) {
	    read[i] = stdin.nextInt();
	    i++;
	}	

	i = 0;
	while(read[i] != 0) {
	    System.out.println(Pcount(read[i]));
	    i++;
	}
    }


    //与えられた整数に対して、n < x <= 2*n の素数を探し個数を数え返却する
    static int Pcount(int a) {
	int count = 0;
	for(int i = (a+1); i <= 2*a; i++) {
	    if(isPrime(i)) count++;
	}
	return count;	
    }

    //ある数が素数かどうか判定する
    static boolean isPrime(int n) {
	int f = (int)Math.sqrt(n);
	while((n % f)  > 0) f--;
	return f == 1;
    }
}