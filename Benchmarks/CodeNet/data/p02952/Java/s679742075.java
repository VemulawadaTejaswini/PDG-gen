import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str;
    int count = 0;

    for(int i=1; i<=n; i++){
      str = String.valueOf(i);
      if(str.length()%2!=0){
        count += 1;
      }

    }
    System.out.println(count);
  }
}