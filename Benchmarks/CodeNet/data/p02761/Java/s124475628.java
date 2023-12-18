import java.util.*;
public class Main{
  public static int n,m;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    int[] s = new int[m];
    int[] c = new int[m];
    for(int i=0;i<m;i++){
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    
    System.out.println(solve(s,c));
  }
  
  public static String solve(int[] s,int[] c){
    for(int i=0;i<1000;i++){
      String str=String.valueOf(i);
      if(ok(str,s,c)) return str; 
    }
    return "-1";
  }
  
  public static boolean ok(String str,int[] s,int[] c){
    if(n!=str.length()) return false;
    for(int i=0;i<m;i++){
      if(str.charAt(s[i]-1)!=c[i]+'0') return false;
    }
    return true;
  }
  
}