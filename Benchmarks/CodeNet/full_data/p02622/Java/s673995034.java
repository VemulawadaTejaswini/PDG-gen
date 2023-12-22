import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int n=s.length();
    int count=0;
    for(int i=0;i<n;i++){
      if(s.charAt(i)!=t.charAt(i)){
        count=count+1;
      }
    }
    System.out.print(count);
  }
}