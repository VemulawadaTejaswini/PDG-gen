
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();      
        int r = scan.nextInt();        
 
        if(W>=x+2*r&&0<=x-2*r){
            if(H>=y+2*r&&0<=y-2*r)
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
 
            
    }
}

