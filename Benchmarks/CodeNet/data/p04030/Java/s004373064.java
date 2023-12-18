import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String answer="";
    String answerBack="";
    char[] b=a.toCharArray();
    for(char c:b){
      if(c=='0'){
        answerBack=answer;
        answer=answer+'0';
      }else if(c=='1'){
        answerBack=answer;
        answer=answer+'1';
      }else if(c=='B'){
        answer=answerBack;
      }
    }
  }
}