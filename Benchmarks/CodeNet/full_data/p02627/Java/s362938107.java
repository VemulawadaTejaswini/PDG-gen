import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        char[] c = str.toCharArray();

        int code = (int)c[0];

        if(code<91){
            System.out.println("A");
        }else{
            System.out.println("a");
        }

        //System.out.println(code);


        //END
    }
}



