import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt() -1;
    int b = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int d = sc.nextInt()-1;
    String s = sc.next();
    int istack,istack2;
    String sstack = s;
    int last;
    boolean mpos = true;
    boolean spos = true;
    
    if(c < d) last = d;
    else last = c;
    for(int i = a;i < last-1;i++){
      if(s.charAt(i) == '#' && s.charAt(i+1) == '#') mpos = false;
    }
    if(c > d){
      spos = false;
      for(int i = a;i < last-2;i++){
        if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.') spos = true;
      }
    }
    
    
  	if(mpos && spos) System.out.println("Yes");
    else System.out.println("No");
    
    
  }
}
