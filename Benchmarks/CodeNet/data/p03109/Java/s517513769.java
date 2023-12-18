import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final String S=sc.next();
    String[] s=S.split("/");
    int y=Integer.parseInt(s[0]);
    int m=Integer.parseInt(s[1]);
    int d=Integer.parseInt(s[2]);
    boolean flg=false;
    if(y<=2019){
      if(m<=4){
        if(d<=30){
          flg=true;
        }
      }
    }
    if(flg){
      System.out.println("Heisei");
    }else{
      System.out.println("TBD");
    }
  }
}