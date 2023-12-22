import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    
    int x;
    1 <= x && x <= 10000; 
    int i = 1;

    while(i <= 10000){
    Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
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