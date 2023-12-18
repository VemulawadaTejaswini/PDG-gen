import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int a  = sc.nextInt()-1;
    int b  = sc.nextInt()-1;
    int c  = sc.nextInt()-1;
    int d  = sc.nextInt()-1;
    String S  = sc.next();
    char[] s = S.toCharArray();
    
    for(int i = 1; i < n-1; i++){
        if(s[i] == '#' && s[i-1] == '#'){
          System.out.println("No");
        }
    }
   
    if(c < d){
      System.out.println("Yes");
    }else{
      while(a+2 <= n && b+2 <=n){
        if((s[a+1] == '#' || a+1 == b) && (s[a+2] == '#' || a+2 == b)){
          if(a+1 == b && s[b+1] == '#' && s[b+2] == '.'){
            b+=2;
            a++;
            if(b == d && s[b+1] != '.'){
              System.out.println("No");
              return;
            }
          }else if(a+2 == b && s[b+1] == '.'){
            b++;
            a+=2;
            if(b == d && s[b+1] != '.'){
              System.out.println("No");
              return;
            }
          }else if(a+2 == b && s[b+1] == '#' && s[b+2] =='.'){
            b+=2;
            a+=2;
            if(b == d && s[b+1] != '.'){
              System.out.println("No");
              return;
            }
          }
        }else if(a+1 == b && s[a+2] == '.'){
          a+=2;
          if(a == c){
            System.out.println("Yes");
            return;
          }
        }else if(s[a+1] == '.'){
          a++;
          if(a == c){
            System.out.println("Yes");
            return;
          }
        }else if(s[a+1] == '#' && s[a+2] == '.'){
          a+=2;
          if(a == c){
            System.out.println("Yes");
            return;
          }
        }
      }
    }   
  }
}