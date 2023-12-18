import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    long sum = 0;


    if(k>=n) {
      System.out.println(0);
    } else {
      for(int i=0;i<n-k;i++) {
        arr[i]=sc.nextInt();
        sum = sum + arr[i];
      }

      System.out.println(sum);
    }
    
    }
  }
