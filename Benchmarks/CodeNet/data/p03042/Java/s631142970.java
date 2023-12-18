import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String yymm = sc.next();
    StringBuilder sb = new StringBuilder();
    sb.append(yymm);
    String yy = sb.substring(0,2);
    String mm = sb.substring(2,4);
    boolean isYYMM = false;
    boolean isMMYY = false;
    String answer = "";
    int month = Integer.parseInt(mm);
    int year = Integer.parseInt(yy);
    if(month>=1&&month<=12){
      isYYMM = true;
    }
    if(year>=1&&year<=12){
      isMMYY = true;
    }
    if(!isYYMM&&!isMMYY){
      answer = "NA";
    }else if(isYYMM&&!isMMYY){
      answer = "YYMM";
    }else if(!isYYMM&&isMMYY){
      answer = "MMYY";
    }else{
      answer = "AMBIGUOUS";
    }
    System.out.println(answer);
  }
}