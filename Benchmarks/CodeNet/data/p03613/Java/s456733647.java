import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws Exception {
    int N =0 ,i=0,max=0,count=0;
  //  Scanner in = new Scanner (System.in);
    BufferedReader in=new BufferedReader( new InputStreamReader(System.in));
    N=Integer.parseInt(in.readLine());
   StringTokenizer x= new StringTokenizer(in.readLine());
    PrintWriter out = new PrintWriter(System.out);  
  
    in.close();
    List counted= new ArrayList();
    int []nthn=new int[N*2];
    while(N!=0){
    nthn[i]=Integer.parseInt(x.nextToken()); 
    nthn[i+N]=nthn[i]-1;
    i++;
    N--;}
   // int l=nthn.length;
   
 
        for (int j = 0; j < nthn.length; j++) {
         //   if (j<nthn.length) System.out.print(nthn[j]+" " );
         //if (counted.contains(nthn[j-nthn.length]-1)) break;
         if (!counted.contains(nthn[j])) {
             count=0;
               for (int k = 0; k < (nthn.length/2); k++) {
               
                if (j<(nthn.length/2)){
                count = (nthn[j]==(nthn[k]+1)||nthn[j]==(nthn[k])-1)?++count:count;
                counted.add(nthn[j]);}
                //if(nthn[j]==nthn[j-1]) j++;
              else{
                 
               count = ((nthn[j])==(nthn[k]+1))?++count:count;      
               counted.add(nthn[j]);
                }
            }
            max=(max>count)?max:count;
            
        }}
       out.println(max+1);
       out.flush();
       out.close();
    }
}
/*

Problem Statement

You are given an integer sequence of length N, a1,a2,…,aN.

For each 1≤i≤N, you have three choices: add 1 to ai, subtract 1 from ai or do nothing.

After these operations, you select an integer X and count the number of i such that ai=X.

Maximize this count by making optimal choices.
Constraints

    1≤N≤105
    0≤ai<105(1≤i≤N)
    ai is an integer.




*/