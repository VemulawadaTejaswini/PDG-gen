import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] arr = new long[n];
    long sum = 0;
    for(int i=0;i<n;i++){
      arr[i] = scan.nextLong();
    }
    
    for(int i=1;i<n;i++){
      if(arr[i-1] > arr[i]){
        long d = arr[i-1] - arr[i];
        arr[i] = arr[i] + d;
        sum = sum + d;
      }
    }
    System.out.println(sum);
        
    
  }
  
}