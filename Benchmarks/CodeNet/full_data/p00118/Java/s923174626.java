import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
  public static int M;
  public static int N;
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        Boolean flag = true;
         
        while(flag){
            M = scan.nextInt();
            N = scan.nextInt();
         //   System.out.println(M);System.out.println(N);
           
            if(N ==0 && M ==0){break;}
            
            int ans =0;
            if(M==1&&N==0){System.out.println(ans);continue;}
            scan.nextLine();
            char [][] field =new char[M][N];
            for(int i=0;i<M;i++){
             String line = scan.nextLine();
                for(int j=0;j<N;j++){
                    field[i][j] = line.charAt(j);
                
                }
            }
            
 
            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(field[i][j] != '.'){
                    	++ans;
                        dfs(i,j,field);
                        
                    }
                }
            }
            System.out.println(ans);
            
    }