import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char s = sc.nextChar();
    if(Character.isUpperCase(s)){
      System.out.println("A");
    }
    else{
      System.out.println("a");
    }
  }
}