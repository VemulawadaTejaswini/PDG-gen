import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =  in.nextInt();
        long[][] arr= new long[n][m];
        for(int i =0; i< n; i++) {
           for(int j =0; j< m ; j++) {
              String c = in.next();
              if(c=="#"){
                arr[i][j]  =-1;
              }
           }
        }
        
      for(int i =0; i< n; i++) {
           for(int j =0; j< m ; j++) {
              if(arr[i][j]!=-1) {
                 if(i-1>=0 && j-1>=0) 
                   arr[i][j] = arr[i-1][j] + arr[i][j-1];
                  else if(i-1<0 && j-1>=0) {
                    arr[i][j] =arr[i][j-1];
                  } else if(j-1<0 && i-1>=0){
                    arr[i][j] = arr[i-1][j]; 
                  } else {
                    arr[i][j] =0;
                  }
              }
           }
        }
      
        System.out.println(arr[n][m]%1000000007); 
        
    }
}
