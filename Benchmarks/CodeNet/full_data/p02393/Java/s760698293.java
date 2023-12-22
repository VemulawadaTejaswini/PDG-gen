
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a < b && b < c)
        System.out.println(a +" " + b +" " + c);
        
         if(a < c && c < b)
        System.out.println(a +" " + c +" " + b);
         
          if(b < a && a < c)
        System.out.println(b +" " + a +" " + c);
          
           if(b < c && c < a)
        System.out.println(b +" " + c +" " + a);
           
            if(c < a && a < b)
        System.out.println(c +" " + a +" " + b);
            
             if(c < b && b < a)
        System.out.println(c +" " + b +" " + a);
    }
}

