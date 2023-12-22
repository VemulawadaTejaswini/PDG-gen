//Triple Dots
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    String s=sc.nextLine();
    int q=s.length();
    char[] c=s.toCharArray();
    if(q>p){
      for(int t=1;t<p+1;t++){
        System.out.print(c[t]);
      }
      System.out.println("...");
    }else{
      System.out.println(s);
    }
  }
}
