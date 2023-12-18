import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int t=100;
    int sum=0;
    int k=sc.nextInt();
    while(t<k){
      t= t+floor(t*0.01);
      sum++;
    }
    System.out.println(sum);
  }
}
      