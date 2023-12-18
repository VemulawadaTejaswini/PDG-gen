import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cubes = sc.next();
        int N = cubes.length();

        int red = 0, blue = 0;
        for(int n=0; n<N; n++){
            if(cubes.charAt(n)=='0') red++;
            else blue++;
        }
        System.out.println(2*Math.min(red,blue));
    }
}