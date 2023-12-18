
import java.util.Scanner;


public class Main {
    static int a;
    static String s;
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        do{
            a = stdIn.nextInt();
        }while(a>=5000 || a<2800);
        s = stdIn.next();
        System.out.print(check());
    }
    private static String check(){
        if(a>=3200) return s;
        return String.valueOf(a);
    }
}