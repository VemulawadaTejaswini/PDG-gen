import java.util.*;
public class Main{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc=new Scanner(System.in);
    int H = sc.nextInt();
    int log = (int) Math.log(H);
    int n = (int) Math.floor(log+1);
    int sum = (int) (Math.pow(2,n)-1);
    
    System.out.println(sum);
  }
}