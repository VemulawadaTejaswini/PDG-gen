import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    for(int i = 0; i < n; ++i) {
    	if(isPrime(sc.nextInt())){
    		cnt += 1;
    	}
    }

    System.out.println(cnt);
  }

  public static boolean isPrime(int p) {
	for(int q = 2; q < p/2 + 1; ++q){
		if(p % q == 0){
			return false;
		}
	}
  	return true;
  }
}