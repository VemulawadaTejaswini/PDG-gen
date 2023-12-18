import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String o="";
       int a=sc.nextInt();
       int b=sc.nextInt();
      int m=Math.max(a,b);
      int n=Math.min(a,b);
      for(int i=0;i<m;i++){
      	o+=Integer.toString(n);
      }
      System.out.println(o);
    }
}