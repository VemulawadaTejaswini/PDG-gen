import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }
      int[] arr = new int[n];
      for(int i=0; i<n; i++) {
	int a = sc.nextInt();
        arr[i] = a;	
      }
      int max_sum = -100000000000000;
      for(int i=0; i<n; i++) {
	int sum = arr[i];
        for(int j=i+1; j<n; j++) {
	  sum += arr[j];
	  if(max_sum < sum) {
            max_sum = sum;
          } 
        }
      } 
      System.out.println(max_sum);
    }
  }
}