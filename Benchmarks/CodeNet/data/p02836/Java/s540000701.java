import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int n = s.length();
    
    int d = 0;
    
    for(int i=0; i<n/2; i++){
      if(c[i] != c[(n-1)-i]){
        d++;
      }
    }
    
    System.out.println(d);
    
  }
}
