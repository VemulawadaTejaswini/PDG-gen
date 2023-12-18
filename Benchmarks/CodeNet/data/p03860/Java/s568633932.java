import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[] s=sc.next().split(" ");
    s[1]=s[1].replaceAll("a-z","A-Z");
    char[] answer={s[0].charAt(0),s[1].charAt(0),s[2].charAt(0)};
    String ans=String.valueOf(answer);
    System.out.println(ans);
  }
}