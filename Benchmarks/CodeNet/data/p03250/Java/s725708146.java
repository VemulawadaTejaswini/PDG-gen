import java.util.*;
public class Main{
     public static void main(String [] args){
          Scanner k=new Scanner(System.in);
          int a=k.nextInt();
          int b=k.nextInt();
          int c=k.nextInt();
          int z;
          if(a>b &&b>c){
               z=a*10+b;
               System.out.println(z+c);
          }
          else if(a>c&&c>b){
               z=a*10+c;
               System.out.println(z+b);
          }
          else if(b>a&&a>c){
               z=b*10+a;
               System.out.println(z+c);
          }
          else if(b>c&&c>a){
               z=b*10+c;
               System.out.println(z+a);
          }
          else if(c>a&&a>b){
               z=c*10+a;
               System.out.println(z+b);
          }
          else if(c>b&&b>a){
               z=c*10+b;
               System.out.println(z+a);
          }
     }
}
