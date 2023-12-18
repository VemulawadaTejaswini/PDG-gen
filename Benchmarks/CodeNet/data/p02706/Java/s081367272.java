import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    int  m = sc.nextInt();    
    int[] a = new int[m];
    int sum = 0;
    for(int i = 0;i < m;i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    if(n > sum){
      System.out.println(n - sum);
    }else{
      System.out.println("-1");
    }
  }
}