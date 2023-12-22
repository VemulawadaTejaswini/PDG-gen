import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    for(int i=0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    
    for(int i=1;i<n;i++){
      if(arr[i-1] > arr[i]){
        int d = arr[i-1] - arr[i];
        arr[i] += d;
        sum += d;
      }
    }
    System.out.println(sum);
        
    
  }
  
}