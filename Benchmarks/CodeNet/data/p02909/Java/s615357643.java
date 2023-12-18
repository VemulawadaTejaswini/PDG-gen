import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<String> w = new ArrayList<String>(){
      add("Sunny");
      add("Cloudy");
      add("Rainy");
      add("Sunny");
    }
    System.out.println(w[indexOf(s)+1]);
  }
}