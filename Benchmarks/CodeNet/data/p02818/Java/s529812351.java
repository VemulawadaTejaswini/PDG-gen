import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        Integer x[]=new Integer[100]; 
        for (int i = 0; i < 3; i++) {
            x[i]=input.nextInt();
        }
        int b=x[0]-x[2];
        int a=0;
        if(b<0){
            a=x[1]+b;
            b=0;
        }
        System.out.println(b);
        System.out.println(a);
    }
}