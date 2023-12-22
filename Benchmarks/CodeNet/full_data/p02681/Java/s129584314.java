import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    boolean contains;
    String str2=sc.nextLine();
    if(str2.contains(str1)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
