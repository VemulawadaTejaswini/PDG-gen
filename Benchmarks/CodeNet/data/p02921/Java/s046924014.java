import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int d;
    for(int i = 0;i < 3; i++){
      if(s.charAt(i) == s.charAt(i)){
        d++;
      }
    }
    System.out.println(d);
  }
}