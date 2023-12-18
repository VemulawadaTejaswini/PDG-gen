import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] S = s.split("");
    String str = "";
    for(int i = 0;i < S.length;i++){
      if(!(str.equals("")) && S[i].equals("B")){
        str = str.substring(0, str.length() - 1);
      }
      else if(!(S[i].equals("B"))){
        str += S[i];
      }
    }
    System.out.println(str);
    
  }
}
