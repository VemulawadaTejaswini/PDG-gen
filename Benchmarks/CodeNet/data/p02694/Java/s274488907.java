import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long prop = 100;
        int count = 0;
        double rate = 1.01;

        while(true){
            if(prop<X){
                prop *= rate; count++;
            } else { 
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}