import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    String s = sc.next();
    String t=sc.next();
    int sum=0;
    for(int i=0;i<3;i++){
      if(s.charAt(i)==t.charAt(i)){
        sum++;
      }
    }
    System.out.println(sum);
  }
}
