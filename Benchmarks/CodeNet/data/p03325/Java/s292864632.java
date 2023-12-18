import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] a = new int[n];
    for(int j = 0; j < n; j++)
      a[j] = sc.nextInt();
    
    for(int j= 0; j < n; j++){
        while(a[j] % 2 == 0){
          a[j] /= 2;
          count++;
        }
    }
    
    System.out.println(count);
  }
}