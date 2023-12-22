//package NomuraContest2020;

import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Start here:
        String input[]=br.readLine().split(" ");
        
        int h1=Integer.parseInt(input[0]);
        int m1=Integer.parseInt(input[1]);
        int h2=Integer.parseInt(input[2]);
        int m2=Integer.parseInt(input[3]);
        
        int time=Integer.parseInt(input[4]);
        
        int t=(h2-h1)*60+(m2-m1);
        
        int ans=t-time;
        if(ans<0)
        {
        	System.out.println(-1);
        }
        else
        {
        	System.out.println(ans);
        }
        
        

    }
}