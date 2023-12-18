import java.util.Scanner;

public class Main{
  static String S;
  static String K;
  static String[] str;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    S = sc.next();
    K = sc.next();
    str = S.split("");
    for(int i=0;i<200;i++){
      if(str[i].equals(1)){
      }
      else{
        System.out.println(str[i]);
        break;
      }
    }
  }
}