import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
    long X = 1;
    if(isPrime(N)){
      System.out.println(N-1);
      System.exit(0);
    }
    for(long i = (long)Math.sqrt(N); i < N;i++){
      if(N%i == 0){
        X = i;
        break;
      }
    }
    System.out.println((X-1)+(N/X-1));
	}

  public static boolean isPrime(long num) {
    if (num < 2) return false;
    else if (num == 2) return true;
    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

    double sqrtNum = Math.sqrt(num);
    for (int i = 3; i <= sqrtNum; i += 2)
    {
        if (num % i == 0)
        {
            // 素数ではない
            return false;
        }
    }

    // 素数である
    return true;
  }
}