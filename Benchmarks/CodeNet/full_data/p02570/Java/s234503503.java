import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = br.readLine().split(" ");
        
        int D = Integer.parseInt(s1[0]);
        int T = Integer.parseInt(s1[1]);
        int S = Integer.parseInt(s1[2]);

        if(T * S >= D){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}