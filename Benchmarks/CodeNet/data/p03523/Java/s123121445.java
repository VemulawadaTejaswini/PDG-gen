import java.util.Scanner;
public class c{
  public static void main(String args[]){
    String s=new Scanner(System.in).nextLine();
    if(s.matches("A?KIHA?BA?RA?")){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
