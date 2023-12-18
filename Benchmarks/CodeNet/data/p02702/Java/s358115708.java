import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    int ans = 0;
    for(int i = 0; i < len-3; i++){
      for(int j = i+3; j < len ; j++){
        int sub = s.substring(i,j+1).parseInt();
        if(sub%2019 == 0) ans++;
      }
    }
    System.out.println(ans);
  }
}