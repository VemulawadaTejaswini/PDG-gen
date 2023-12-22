import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
      
        if(y%2==0)
        {
            for(int i=0;i<x;i++)
            {
                y=y/4;;
            }
            if(y==0)
            System.out.print("Yes");
            else
            System.out.print("No");
        }
 
     }
}