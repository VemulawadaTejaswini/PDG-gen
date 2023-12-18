import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String odd = "";
    int slen = s.length();
    if(slen % 2 == 1){
      slen++;
    }
    for(int i = 0;i < slen;i = i + 2){
      odd += s.substring(i,i+1);
    }
    System.out.println(odd);
  }
}
