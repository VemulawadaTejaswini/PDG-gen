import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int i = 1;

    while(i <= 10000){
    int x = scan.nextInt();
        switch(x){
        case 0:
            break;
        default:
        System.out.println(x);
        i++;
        }
    }
    }
}