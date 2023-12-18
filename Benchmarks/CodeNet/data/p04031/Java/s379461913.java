import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    double sum = 0;
    double ans = 0;
    double totalAns = 0;
    for(int i = 0 ;i < N;i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0 ;i < N;i++){
      sum += a[i];
    }
    sum = Math.round(sum/N);
    for(int j = 0;j < N; j++){
      if(a[j] != sum){
        ans = Math.pow((sum - a[j]),2);
        totalAns += ans;
      }
    }
    System.out.println((int)totalAns);
  }
