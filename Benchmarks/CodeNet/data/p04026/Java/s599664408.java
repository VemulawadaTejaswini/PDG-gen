import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int L = s.length();
    
    for (int i=0;i<L-1;i++){
      if (s.charAt(i) ==s.charAt(i+1)){
        System.out.print(i+1);
        System.out.print(" ");
        System.out.print(i+3);
        return;
      }
    }
    for (int i=0;i<L-2;i++){
      if (s.charAt(i) ==s.charAt(i+2)){
        System.out.print(i+1);
        System.out.print(" ");
        System.out.print(i+3);
        return;
      }
    }
    System.out.println("-1 -1");

  }
}