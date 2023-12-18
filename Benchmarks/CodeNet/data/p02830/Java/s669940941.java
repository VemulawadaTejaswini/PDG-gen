import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    String t=sc.next(); 
    String ans=""; 
    for(int i=0;i<n;i++) {
      ans+= s.charAt(i);
      ans+= t.charAt(i);
    }
    System.out.println(ans);
  }
}