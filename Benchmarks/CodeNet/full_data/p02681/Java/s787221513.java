import java.util.*;
class solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=t.charAt(i)){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
    