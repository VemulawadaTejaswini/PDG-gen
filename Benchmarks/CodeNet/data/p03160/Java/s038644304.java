/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = sc.nextInt();
        int []h = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            h[i] = sc.nextInt();
        }
        int []c = new int[n+1];
        c[1] = h[1];
        //c[2] = h[2];
        c[2] = Math.abs(h[2]-h[1]);
        
        for(int i=3;i<=n;i++)
        {
           if(i!=3)
           {
           int r1 = c[i-2]+Math.abs(h[i]-h[i-2]);
           int r2 = c[i-1]+Math.abs(h[i]-h[i-1]);
           c[i] = Math.min(r1, r2);
           }
           else
           {
               int r1 = Math.abs(h[i]-h[i-2]);
           int r2 =Math.abs(h[i]-h[i-1]);
           c[i] = Math.min(r1, r2);
               
           }
          //w.print(c[i] + " ");
        }
        w.println(c[n]);
        
        w.close();
    }
    
}
