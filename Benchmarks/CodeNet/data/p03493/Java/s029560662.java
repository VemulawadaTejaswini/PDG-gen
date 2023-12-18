import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int sum = 0;
    for(int i=0; i<c.length; i++){
      if(c[i] == '1'){
        sum++;
      }
    }
    System.out.println(sum);
  }
}