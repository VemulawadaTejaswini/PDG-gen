import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i=0;i<n;++i){
      num[sc.nextInt()] = i+1;
    }
    for(int i=0;i<n-1;++i){
      System.out.print(num[i]+ " ");
    }
    System.out.println(num[n-1]);
  }
}