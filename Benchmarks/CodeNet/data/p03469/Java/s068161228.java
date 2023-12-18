import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    sb.append("2018").append(s.substring(4));
    System.out.println(sb.toString());
  }
}