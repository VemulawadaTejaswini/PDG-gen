import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    int len=a.length();
    if(a.substring(0,len/2).equals(a.substring(len/2,len))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
