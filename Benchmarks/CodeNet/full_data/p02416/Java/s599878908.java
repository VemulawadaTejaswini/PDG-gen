import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while(true){
    String a = scanner.next();
    if(a.equals("0")) break;
    for(int i = 0; i < a.length(); i++){
      char num = a.charAt(i);
      sum += Integer.parseInt("" + num);
      System.out.println(sum);
    }

    }
  }
}