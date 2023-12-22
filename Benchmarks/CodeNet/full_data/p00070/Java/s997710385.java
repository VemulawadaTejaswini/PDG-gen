


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     static int[][] kazoeage = new int[11][550];
    static boolean[] used = new boolean[10];
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             func(0,0);
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             String spl[] = line.split(" ");
             int n=Integer.parseInt(spl[0]), s = Integer.parseInt(spl[1]);
           if(n<=0||n>=11||s>=333||s<=-1)System.out.println("0");
           else       System.out.println(kazoeage[n][s]);
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     
     static void func( int dep, int sum){
         kazoeage[dep][sum]++;if(dep>=10){return ;}
         for(int i=0; i<=9;i++){
             if(used[i]){continue;}
             used[i]=true;
             func(dep+1,sum+i*(dep+1));
             used[i]=false;
         }
         return ;         
     }
}
  