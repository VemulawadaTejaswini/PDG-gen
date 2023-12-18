import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m+1];
    for(int i = 0; i < n; i++){
      int k = sc.nextInt();
      for(int j = 0; j < k; j++){
        int tmp = sc.nextInt();
        a[tmp]++;
      }
    }
    int count = 0;
    for(int i = 1; i < m+1; i++){
      if(a[i] == n) count++;
    }
    System.out.println(count);
  }
}
