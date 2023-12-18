import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int minus = k-1;
    long sum = 0;
    long check = (long) Math.pow(10,9)+7;
    for (int i=k;i<=n+1;i++){
      sum += 1+i*(n-i+1);
      sum = sum%check;
    }
    System.out.println(sum % check);
  }
}
