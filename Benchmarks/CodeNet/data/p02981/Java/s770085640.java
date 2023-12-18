import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        if(n * a > b){
            System.out.println(b);
        }else{
            System.out.println(n * a);
        }
        
    }
}
