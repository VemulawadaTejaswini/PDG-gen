import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S.length()%2!=0){
      System.out.println("No");
      return;
    }
    for(int i = 0; i < S.length(); i=i+2){
      if(S.charAt(i)!='h'){
        System.out.println("No");
        return;
      }
      if(S.charAt(i+1)!='i'){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}