import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int X,A,B=scan.next();
        Y=X-A*100;
        Z=Y-B;
        if (Z>B){
            Z=Z-B;
        }
        System.out.println(Z);


    }
}