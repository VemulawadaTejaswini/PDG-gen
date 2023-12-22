import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k=sc.nextInt();
    String s=sc.next();
    int l=(s.length()+1)%1000000007;
    long sum=1;
    for(int i=0;i<k;i++){
sum*=(l*26);
      sum%=1000000007;
      l++;
    }
    System.out.println(sum);
  }
}