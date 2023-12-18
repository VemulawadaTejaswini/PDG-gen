import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    int n = s.length();
    int ans = 0;
    
    for(int i=0; i<n-3; i++){
      for(int j=i+4; j<n+1; j++){
        long x = Long.parseLong(s.substring(i,j));
        if(x%2019 == 0){
          ans++;
        }
      }
    }
    
    System.out.println(ans);
  }
}