import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    //SUN,MON,TUE,WED,THU,FRI,SAT
    String[] week = {"","SAT","FRI","THU","WED","TUE","MON","SUN"};
    for(int i=0;i<8;i++){
      if(week[i].equals(s))System.out.println(i);
    }
  }
}