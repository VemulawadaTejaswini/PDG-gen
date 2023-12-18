import java.util.*;
import java.io.*;

/*
   AtCoder contests
   coder : yoichion
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int n=0;n<N;n++){
            int p = sc.nextInt();
            sum += p;
            max = Math.max(max,p);
        }
        System.out.println(sum-max/2);
    }
}