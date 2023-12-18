import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int A=sc.nextInt();
    final int B=sc.nextInt();
    if(A<=B*2){
      System.out.println(0);
    }else{
      System.out.println(A-B*2);
    }
  }
}