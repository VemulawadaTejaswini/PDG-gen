import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int n = 0;

        if(a>=b){
            n += a;
            a--;
        }else{
            n += b;
            b--;
        }

        if(a>=b){
            n += a;
            a--;
        }else{
            n += b;
            b--;
        }

        System.out.println(n);
        
    }
}