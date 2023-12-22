import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] is = {in.nextInt(), in.nextInt()};
        System.out.println(is[0]*is[1] + " " + (is[0]+is[1])*2);
    }
}