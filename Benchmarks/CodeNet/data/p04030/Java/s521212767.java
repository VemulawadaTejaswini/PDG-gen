import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] S = s.split("");
    String[] C = new String[s.length()];
    String zero = "0";
    String one = "1";
    String back = "B";
    for(int i = 0;i < s.length();i++){
      C[i] = "";
    }
    for(int i = 0;i < s.length();i++){
      if(S[i].equals(zero)){
        if(i > 0){
          if(S[i-1].equals(back)){
            C[i-1] = "0";
          }
          else{
            C[i] = "0";
          }
        }
        else{
          C[i] = "0";
        }
      }
      else if(S[i].equals(one)){
        if(i > 0){
          if(S[i-1].equals(back)){
            C[i-1] = "1";
          }
          else{
            C[i] = "1";
          }
        }
        else{
          C[i] = "1";
        }
      }
      else if(S[i].equals(back)){
        if(i > 0){
          C[i-1] = "";
        }
      }
    }
    for(int i = 0;i < s.length();i++){
      System.out.printf("%s",C[i]);
    }
  }
}
