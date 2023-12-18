import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    Scanner scan = new Scanner(System.in);
    long H;

    Main(){
        H = scan.nextLong();
        System.out.println(f(H));
    }
    public long f(long H){
        if(H == 1){return (long)1;}
        else{
            return 2*f(H/(long)2)+1;
        }
        
    }


    public static void main(String[] args){
        new Main();
    }
}