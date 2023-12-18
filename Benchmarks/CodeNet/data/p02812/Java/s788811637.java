import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count =0;
    
   S = replace("ABC","");
    count = (N - S.length())/3;
    System.out.println(count);
}
}