// Java program For handling Input/Output 
import java.io.*; 
import java.util.*;
import java.math.*;
//import java.awt.*;

public class Main 
{ 
    Scanner sc;
    //actual logic
    void solve(){
        int n = ni();
        ns();
        String s[] = new String[n];
        int t[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            s[i] = sc.next();
            t[i] = ni();
            ns();
        }
        String x = ns();
        int ans = 0;
        int f = 0;
        for(int i = 0;i < n;i++)
        {
            if(f == 1)
                ans += t[i];
            if(s[i].equals(x))
                f = 1;
        }
        System.out.println(ans);

    }
    
    //constructor
    Main(){
        try{  
            sc = new Scanner(System.in);
        }catch(Exception e){
            System.out.println(e);
        }
    }


    //main metohd
    public static void main(String[] args)
    { 
       new Main().solve();
   }
    //Utility methods
        //input an integer from scanner
   int ni()
   {
    int a = sc.nextInt();
    return a;
    }
            //input a long from scanner
    long nl()
    {
        return sc.nextLong();
    }
            //input a float from scanner
    float nf(){
        float a = sc.nextFloat();
        return a;
    }
            //input a double from scanner
    double nd(){
        double a = sc.nextDouble();
        return a;
    }
    //input a sentence from scanner
    String ns(){
        return sc.nextLine();
    }
    //input an intger array
    void ia(int a[]){
        for(int i = 0;i < a.length;i++)
            a[i] = sc.nextInt();
    }
            //
    void la(long a[]){
        for(int i = 0;i < a.length;i++)
            a[i] = sc.nextLong();
    }
            //input a float array
    void fa(float a[]){
        for(int i = 0;i < a.length;i++)
            a[i] = sc.nextFloat();
    }
            //input a double array
    void da(double a[]){
        for(int i = 0;i < a.length;i++)
            a[i] = sc.nextDouble();
    }
    //input two dimensional integer array
    void ida(int a[][], int n, int m)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                a[i][j] = ni();
            }
        }
    }
            //input two dimentional long array
    void lda(long a[][], int n, int m)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                a[i][j] = nl();
            }
        }
    }
    //input two dimensional double array
    void dda(double a[][], int n, int m)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                a[i][j] = nd();
            }
        }
    }
    //convert string to integer
    int stoi(String s){
        return Integer.parseInt(s);
    }
    //convert string to double
    double stod(String s){
        return Double.parseDouble(s);
    }
}