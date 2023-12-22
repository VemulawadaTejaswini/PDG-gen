import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        int X=sc.nextInt();
        int Y=sc.nextInt();

        int i=0;

        for(i=0;i<=X;i++){
            int calc=i*2+(X-i)*4;

            if(calc==Y){
                System.out.println("Yes");
                break;
            }
            if(i==X){
                System.out.println("No");
            }
        }
        //END
    }
}


