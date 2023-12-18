import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
    String rgb = sc.nextLine().replace(" ","");
    String result = Integer.parseInt(rgb) % 4 == 0 ? "YES" : "NO";
    System.out.println(result);
  }
}