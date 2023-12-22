import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int n;
        
         if(a > b){
             n = a;
             a = b;
             b = n;   
        }
          if(b > c){
             n = b;
             b = c;
             c = n;
    }
           if(a > b){
             n = a;
             a = b;
             b = n;
}
System.out.println(a + " " + b + " " + c);
    }
}
