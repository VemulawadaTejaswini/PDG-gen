import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int count=1;
    while (n/k>0) {
      n=n/k;
      count++;
    }
    System.out.println(count);
  }
}
