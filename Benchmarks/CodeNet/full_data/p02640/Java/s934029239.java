import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp=y;
        if(y%2==0 && y>=(x*2) && y<=x*4)
        {
            
                  System.out.print("Yes");
        }
        else
      System.out.print("No");   
     }
}