
import java.util.Scanner;


public class Even  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
       
        a=scanner.nextInt();
        b=scanner.nextInt();
        
        if((a*b)%2==0){
            System.out.println("Even" );
        }
        else{
            System.out.println("Odd" );
        }
    }
}
