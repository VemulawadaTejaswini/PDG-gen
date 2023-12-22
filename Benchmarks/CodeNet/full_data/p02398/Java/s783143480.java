import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int number = 0;
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    for(int i = a;i <= b;i++){
        if(c % i == 0){
        number = number + 1;
        }
    }

    System.out.println(number);
    }
}