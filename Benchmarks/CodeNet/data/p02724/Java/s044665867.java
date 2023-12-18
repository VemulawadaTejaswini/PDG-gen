import java.util.*;
public class atcode2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    int n=x/500;
    int m=(x%500)/5;
    System.out.println(n*1000+m*5);
  }
}