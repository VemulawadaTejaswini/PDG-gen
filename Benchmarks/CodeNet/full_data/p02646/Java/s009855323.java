import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int V=sc.nextInt();
        int B=sc.nextInt();
        int W=sc.nextInt();
        int T=sc.nextInt();

        int kyori=A-B;
        int KYORI=Math.abs(kyori);

        int HAYASA=V-W;

        int CALC=T*HAYASA;

        if(V<=W){
            System.out.println("NO");
        }else{
            if(CALC>=KYORI){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        //END
    }
}

