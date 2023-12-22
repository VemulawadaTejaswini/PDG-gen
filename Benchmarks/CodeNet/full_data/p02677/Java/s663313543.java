import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int H=sc.nextInt();
        int M=sc.nextInt();

        double longW=((H%12)*30)+(M*0.5); //長針のデフォルトからの角度
        double shortW=M*6; //短針のデフォルトからの角度

        //System.out.print(longW);
        //System.out.print(" ");
        //System.out.println(shortW);

        double W=longW-shortW;

        if(W<0){
            W=Math.abs(longW-shortW);
        }else if(W>180){
            W=360-W;
        }

        //System.out.println(W);

        double cosW=0;

        if(W==90){
            cosW=0;
        }else{
            cosW=Math.cos(Math.toRadians(W));
        }

        //System.out.println(cosW);

        double JIJOU=A*A+B*B-2*A*B*cosW;

        //System.out.println(A*A+"と"+B*B+"と"+2*A*B*cosW);
        //System.out.println(JIJOU);

        double ans=Math.sqrt(JIJOU);

        System.out.println(String.format("%.15f", ans));
        //END

    }
}

