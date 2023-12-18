import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int K = stdIn.nextInt();
        int X = stdIn.nextInt();
        
        if (K * 500 >= X){
            System.out.println("YES");     
        }else{
            System.out.println("NO");  
         } 


    }
}