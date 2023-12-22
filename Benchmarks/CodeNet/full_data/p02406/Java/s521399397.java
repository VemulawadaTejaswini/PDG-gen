import java.util.Scanner;
import java.io.*;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do {
            int x = i;
            if (x % 3 == 0) {
                System.out.print(" "+i);
                continue;
            }
            do{
                if(x%10==3){
                    System.out.print(" "+i);
                    break;
                }
                x/=10;
            }while(x!=0);
        }while(++i<=n);
        System.out.println();

    }

}