import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] d = new int[N];
        for(int i =0; i< N; i++){
            d[i] = in.nextInt();
        }
        Arrays.sort(d);
        int ans = 1;
        int current = d[0];
        for(int i = 0; i < N; i++){
            if(d[i] > current){
                ans++;
                current = d[i];
            }
        }
        System.out.println(ans);
        in.close();
    }
}
