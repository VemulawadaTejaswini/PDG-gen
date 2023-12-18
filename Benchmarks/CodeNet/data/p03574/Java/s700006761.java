import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();
   char[][] gr = new char[H][W];
   for(int i=0;i<H;i++)
   {
     gr[i] = sc.next().toCharArray();
   }
   char[][] gmap = new char[H+2][W+2];
   for(int i =0;i<H+2;i++) 
   {
     gmap[i][0]='.';
     gmap[i][W+1]='.';
   }
   for(int i =0;i<W+2;i++) 
   {
     gmap[0][i]='.';
     gmap[H+1][i]='.';
   }
   for(int i=0;i<H;i++)
   {
     for(int k =0;k<W;k++)
     {
       gmap[i+1][k+1]= gr[i][k];
     }
   }
   StringBuilder sb = new StringBuilder();
   int count=0;
   for(int i=1;i<H+1;i++)
   {
     for(int k=1;k<W+1;k++)
     { 
       count = 0;
       if(gmap[i][k]=='#')
       {
         sb.append('#');
         continue;
       }
       if(gmap[i-1][k-1]=='#')
       {
         count++;
       }
       if(gmap[i][k-1]=='#')
       {
         count++;
       }
       if(gmap[i+1][k-1]=='#')
       {
         count++;
       }
       if(gmap[i-1][k]=='#')
       {
         count++;
       }
       if(gmap[i+1][k]=='#')
       {
         count++;
       }
       if(gmap[i-1][k+1]=='#')
       {
         count++;
       }
       if(gmap[i][k+1]=='#')
       {
         count++;
       }
       if(gmap[i+1][k+1]=='#')
       {
         count++;
       }
       sb.append(count);
       
     }
     System.out.println(sb.toString());
     sb.setLength(0);
   }
 }
}