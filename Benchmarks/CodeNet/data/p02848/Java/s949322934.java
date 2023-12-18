import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char[] c=sc.next().toCharArray();
    for(int i=0;i<c.length;i++){
      int a=(int)c[i];
      a+=n;
      a%=26;
      a+=52;
      c[i]=(char)a;
    }
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]);
    }
    System.out.println("");
  }
}