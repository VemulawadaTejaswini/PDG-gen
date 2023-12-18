import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int k = sc.nextInt();
    char ans[] = new char[n];
    char key = s.charAt(k);
    char stack;
    
    for(int i = 0; i < n; i++){
      if(s.charAt(i) == key) ans[i] = key;
      else ans[i] = '*';
    } 
   	
  	for(int i = 0; i < n; i++) System.out.print(ans[i]);
    System.out.println();

  }
}
