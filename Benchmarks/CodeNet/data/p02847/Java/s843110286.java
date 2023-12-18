import java.util.*;

public class Main {
  static final String weeks = "SUNSATFRITHUWEDTUEMON";
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int index = weeks.indexOf(str);
    if(index > 0){
      index = (index -1) / 3;
    }
    System.out.println(String.valueOf(index));
  }
}