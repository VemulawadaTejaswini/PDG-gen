import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();   
    int[] a = new int[n - 1];
    for(int i = 0;i < n - 1;i++){
      a[i] = sc.nextInt();
    }
    for(int j = 1;j <= n;j++){
      int count = 0;
      for(int x = 0;x < n - 1;x++){
        if(a[x] == j){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}