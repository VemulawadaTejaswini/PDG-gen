import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int start = 0;
    int last = 0;
    int both = 0;
    int cnt = 0;
    for(int i = 0;i < n;i++){
      s[i]=sc.next();
      if(s[i].contains("AB"))cnt++;
      if(s[i].charAt(0)=='B'&&s[i].charAt(s[i].length()-1)=='A')both++;
      else if(s[i].charAt(0)=='B')start++;
      else if(s[i].charAt(s[i].length()-1)=='A')last++;
    }
    boolean amari = false;
    if(both>=1)amari = true;
    while(both>0){
      if(start==last&&start!=0){
        start++;
        both--;
      }else if(start>last&&start>0){
        last++;
        both--;
      }else if(last>start&&last>0){
        start++;
        both--;
      }
    }
    cnt+=Math.min(start,last);
    if(amari&&start==last+1)cnt++;
    System.out.println(cnt);
  }
}
