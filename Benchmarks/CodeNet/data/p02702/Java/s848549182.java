import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    int ans =0;
    for(int i=0;i<len;i++){
      for(int j=i+4;j<=len;j++){
        if(Long.parseLong(s.substring(i,j)) % 2019 == 0)
          ans += 1;
      }
    }
    System.out.println(ans);
  }
}
