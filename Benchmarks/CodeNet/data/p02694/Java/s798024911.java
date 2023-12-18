import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    double t=100;
    int sum=0;
    int k=sc.nextInt();
    while(t<k){
      t= t+Math.floor(t*0.01);
      sum++;
    }
    System.out.println(sum);
  }
}
