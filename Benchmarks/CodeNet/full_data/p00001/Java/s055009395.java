import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  	
  	final int N = 10;
  	int[] a = new int[N];
  	
  	Scanner sc = new Scanner(System.in);
  	
  	for(int i = 0; i < N; ++i) {
	  	a[i] = sc.nextInt();
  	}
  	
  	Arrays.sort(a);
  	
  	for(int i = 0; i < 3; ++i) {
  		System.out.println(a[N - i - 1]);
  	}
  }
}