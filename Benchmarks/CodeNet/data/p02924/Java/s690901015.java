import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long s = 0;
    for(int i = 1; i < N; i++){
      s += i;
    }
    System.out.println(s);
  }
}