import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N=sc.next();
    String judge= N.charAt(0)==N.charAt(N.length()-1)?"Yes":"No";
    System.out.println(judge);
  }
}