import java .util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    String day_up = "2018/";
    
    for (int i = 5; i < 10; i++){
      day_up = day_up + day.substring(i, i+1);
    }
    System.out.println(day_up);
    
  }
}