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
    for(int i=0;i<str.length;i++){
      if(str[i].equals("1")){
        if(i==Integer.parseInt(K)){
          System.out.println("1");
          break;
        }
        else{

        }
      }
      else{
        System.out.println(str[i]);
        break;
      }
    }
  }
}
