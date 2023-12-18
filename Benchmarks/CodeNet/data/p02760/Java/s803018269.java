                    ////////////////////////////////////////////////////
                    //                                                //
                    //  For her who keeps the fire kindling in me...  //
                    //                                                //
                    ////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.StringTokenizer;
import java.util.*;
import java.lang.Math;
import java.awt.Point;                            

import java.awt.geom.*;

public class Main{

    // static class Pair{
    //     int x;
    //     int y;
    // }

    public static void main(String args[]){
        try{
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j, k, x, y, t, n, count, key, size, Pairer, minglob, minloc, beg, end, begl, endr, ld, up, down, maxele, minele;
            long ans, sqrt, q, r, sum, maxup, maxdown, m, X, Y, Q, MOD;//, sum2;
            boolean flag, flag2;

            double avg;

            // t = s.nextInt();

            // for(; t>0; t--){

                //n = s.nextInt();
                //Y = s.nextLong();

                int arr[][] = new int[3][3];
                // boolean boolarr[][] = new boolean[3][3];

                // Arrays.fill(bool);

                TreeSet<Integer> ts= new TreeSet<Integer>();


                for(i=0; i<3; i++)
                    for(j=0; j<3; j++)
                        arr[i][j] = s.nextInt();

                n = s.nextInt();

                for(i=0; i<n; i++)
                    ts.add(s.nextInt());


                flag = false;
                if(ts.contains(arr[0][0]) && ts.contains(arr[0][1]) && ts.contains(arr[0][2]))
                    flag = true;

                if(ts.contains(arr[1][0]) && ts.contains(arr[1][1]) && ts.contains(arr[1][2]))
                    flag = true;

                if(ts.contains(arr[2][0]) && ts.contains(arr[2][1]) && ts.contains(arr[2][2]))
                    flag = true;

                if(ts.contains(arr[0][0]) && ts.contains(arr[1][0]) && ts.contains(arr[2][0]))
                    flag = true;

                if(ts.contains(arr[0][1]) && ts.contains(arr[1][1]) && ts.contains(arr[2][1]))
                    flag = true;

                if(ts.contains(arr[0][2]) && ts.contains(arr[1][2]) && ts.contains(arr[2][2]))
                    flag = true;

                if(ts.contains(arr[0][0]) && ts.contains(arr[1][1]) && ts.contains(arr[2][2]))
                    flag = true;

                if(ts.contains(arr[0][2]) && ts.contains(arr[1][1]) && ts.contains(arr[2][0]))
                    flag = true;


                if(flag){
                    w.write("Yes\n");
    
                }else
                    w.write("No\n");

            // }
            w.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
                
                
//========================================### FAST IO ###=========================================//
class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                    InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    Double nextDouble() 
    { 
        return Double.parseDouble(next());
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str;
    } 
}
    //====================================================================================================//