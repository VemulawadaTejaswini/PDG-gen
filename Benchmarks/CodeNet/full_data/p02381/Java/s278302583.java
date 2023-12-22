import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   while(true){
    int n = sc.nextInt();
    int sum=0;
    double m=0;
    double ans=0;
    double sum1=0;
    if(n==0){
      break;
    }
    int[] s = new int[n];
    for(int i=0;i<n;i++){
     s[i]=sc.nextInt();
     sum += s[i];
    }
    m = (double)sum/n;
    for(int i=0;i<n;i++){
      sum1 += ((double)s[i]-m)*((double)s[i]-m);
    }
    ans = Math.sqrt(sum1/n);
    System.out.println(ans);
   }
  }
}
