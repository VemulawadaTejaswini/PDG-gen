import java.util.*;
public class Main{
     public static void main(String [] args){
          Scanner k=new Scanner(System.in);
          int a=k.nextInt();
          int b=k.nextInt();
          int c=k.nextInt();
          int poss1=a*10+b+c;
          int poss2=b*10+a+c;
          int poss3=c*10+a+b;
          
          int max=poss1;
          String maxx="";
          
          if(poss2>=max){
               max=poss2;
          }else if(poss3>=max){
               max=poss3;
          }
          System.out.print(max);
     }
}