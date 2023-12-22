import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String str1="ABC";
    String str2="ARC";
    if(S.equals(str1)){
      System.out.println("ARC");
    }else if(S.equals(str2)){
      System.out.println("ABC");
    }
  }
}
