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
    if(both==0)cnt+=Math.min(last,start);
    else if(start+last==0)cnt+=both-1;
    else if(start+last>0)cnt+=both+Math.min(start,last);
    System.out.println(cnt);
  }
}
