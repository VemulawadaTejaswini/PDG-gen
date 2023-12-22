import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    input();
   }
   static void input()
   {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     
     int m = sc.nextInt();
     
     int l = sc.nextInt();
     
     long a[][] = new long[n][m];
     
     long b[][] = new long[m][l];
     
     long c[][] = new long[n][l];
     //input a
     for(int i = 0; i < n; i ++)
     {
       for(int j = 0; j < m; j ++)
       {
         a[i][j] = sc.nextLong();
       }
     }//input b
     for(int i = 0; i < m; i ++)
     {
       for(int j = 0; j < l; j ++)
       {
         b[i][j] = sc.nextLong();
       }
     }//a * b
     multiplication(a,b,c);
     
   }
   static void multiplication(long a[][],long b[][],long c[][])
   {
     for(int i = 0; i < c.length; i ++)
     {
       for(int j = 0; j < c[i].length; j ++)
       {
         for(int k = 0; k < b.length; k ++)
         {
           c[i][j] += a[i][k] * b[k][j];
         }
       }
     }
     output(c); 
   }
   static void output(long c[][])
   {
     for(int i = 0; i < c.length; i ++)
     {
       for(int j = 0; j < c[i].length; j ++)
       {
         if(j != 0)System.out.print(" ");
         
         System.out.print(c[i][j]);
       }
       System.out.println();
     }
   }
 }
    
