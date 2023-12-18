import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int A=scan.nextInt();
    int B=scan.nextInt();
    int C=scan.nextInt();

    if(A+B+C>=22){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}