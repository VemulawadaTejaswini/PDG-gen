import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for(int i=0;i<n;i++){
      int count = 0;
      String s1 = s.substring(0,i+1);
      String s2 = s.substring(i+1,n);
      for(char c='a';c<='z';c++){
        if(s1.contains(String.valueOf(c)) && s2.contains(String.valueOf(c))){
          count++;
        }
      }
      ans = Math.max(ans,count);
    }
    System.out.println(ans);
  }
}
