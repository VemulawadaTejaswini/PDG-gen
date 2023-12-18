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
    cnt+=Math.max(both-1,0);
    if(both>0&&last>0){
      cnt++;
      last--;
    }
    if(both>0&&start>0){
      cnt++;
      start--;
    }
    cnt+=Math.min(start,last);
    System.out.println(cnt);
  }
}