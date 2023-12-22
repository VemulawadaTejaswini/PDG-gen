import java.util.Scanner.*;
public class A{
  public static void main(String[]args){
    Scanner sc=new Scanner();
    int D=sc.nextInt();
    int T=sc.nextInt();
    int S=sc.nextInt();
    if(D/S<=T){
      Sysetm.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}