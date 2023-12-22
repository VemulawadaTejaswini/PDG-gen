import java.util.Scanner;


public class Main
{

    
    public static void main(String[] args)
    {
       Scanner i = new Scanner(System.in); 
       String s = i.next();
       for(int k=s.length()-1;k>=0;k--)
       {
           System.out.print(s.charAt(k));
       }
       
    }
    
}

