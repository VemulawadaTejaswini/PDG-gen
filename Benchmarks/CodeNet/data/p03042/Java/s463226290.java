import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner cs = new Scanner(System.in);
	String s = cs.nextLine();
    int a,b;

    a = Integer.parseInt(s.substring(0,2));
    b = Integer.parseInt(s.substring(2,4));
    String ans;
    if(a>12&&b>12){
      ans = "NA";
    }else if(a<13&&b<13){
      ans = "AMBIGUOUS";
    }else if(a<13&&b>12){
      ans = "MMYY";
    }else{
      ans = "YYMM";
    }
    System.out.println(ans);

    
  }
}