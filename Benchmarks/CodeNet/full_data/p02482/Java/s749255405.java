import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] is = {in.nextInt(), in.nextInt()};
        if     (is[0]==is[1]) System.out.println("a == b");
        else if(is[0]>is[1])  System.out.println("a > b");
        else                  System.out.println("a < b");
    }
}