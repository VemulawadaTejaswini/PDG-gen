import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
    long X = 1;
    ArrayList<Long> array = new ArrayList<>();

    for(long i = 1; i <= (long)Math.sqrt(N);i++){
      if(N%i == 0){
        array.add(i + (N/i));
      }
    }

    long culc = array.get(0);
    for(int i = 1; i < array.size(); i++){
      if(array.get(i) < culc)
        culc = array.get(i);
    }

    System.out.println(culc-2);
	}

  public static boolean isPrime(long num) {
    if (num < 2) return false;
    else if (num == 2) return true;
    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

    double sqrtNum = Math.sqrt(num);
    for (int i = 3; i <= sqrtNum; i += 2){
        if (num % i == 0){
            // 素数ではない
            return false;
        }
    }

    // 素数である
    return true;
  }
}