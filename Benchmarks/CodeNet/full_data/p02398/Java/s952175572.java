import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){


    int i = 1;

    while(i <= 10000){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if(x == 0){
            break;
        }

        System.out.println("case" + i + ":" + x );
        i++;
    }
}
}