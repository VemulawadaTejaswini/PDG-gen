import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    if (a.equals(b.substring(0,a.length())) && a.length() +1 == b.length()){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }

}