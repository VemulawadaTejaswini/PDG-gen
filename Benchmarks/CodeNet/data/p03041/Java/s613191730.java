import java.util.*;

public class Changing_a_Character{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split();
    int a = sc.nextInt();

    s[a-1] = s[a-1].ToLowerCase();
  }

}