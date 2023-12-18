import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int A=sc.nextInt();
    String   op=sc.next();
    final int B=sc.nextInt();
    if(op=="+"){
      System.out.println(A+B);
    }else{
      System.out.println(A-B);
    }
  }
}