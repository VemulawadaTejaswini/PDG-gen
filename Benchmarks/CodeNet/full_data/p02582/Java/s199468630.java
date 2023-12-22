import java.util.Scanner;
public class Main{
  static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S.length()!=3)System.exit(0);
    if(S.equals("RRR")){
      System.out.println("3");
      System.exit(0);
    }
    if(S.equals("RRS") || S.equals("SRR")){
      System.out.println("2");
      System.exit(0);
    } if (S.equals("SSS")){
        System.out.println("0");
      System.exit(0);
    } else {
      System.out.println("1");
    }
 }
}