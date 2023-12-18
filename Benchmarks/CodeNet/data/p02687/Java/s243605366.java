import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S =="ABC"){
      System.out.println("ARC");
    }
    else if(S=="ARC"){
      System.out.println("ABC");
    }
    else{
      System.out.println("エラー");
    }
  }
}