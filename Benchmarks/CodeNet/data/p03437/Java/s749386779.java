import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int cnt=2;
    int kari=0;
    if(n==m) System.out.println("-1");
    else{
       while(true){
         kari=n*cnt;
         if(kari%m!=0) {
           System.out.println(kari);
           break;
         }
       }
    }
  }
}