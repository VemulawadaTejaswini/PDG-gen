import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String answer="";
    final String S=sc.next();
    char[] s=S.toCharArray();
    int a=Integer.parseInt(String.valueOf({s[0],s[1]}));
    int b=Integer.parseInt(String.valueOf({s[2],s[3]}));
    if(a<=12){
      if(b<=12){
        answer="AMBIGUOUS";
      }else{
        answer="MMYY";
      }
    }else{
      if(b<=12){
        answer="YYMM";
      }else{
        answer="NA";
      }
    }
    System.out.println(answer);
  }
}