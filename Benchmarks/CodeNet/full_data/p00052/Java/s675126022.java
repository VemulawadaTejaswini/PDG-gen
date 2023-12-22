
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 

 class Main{
             
     static int[] ints=new int[10];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){if(line.isEmpty())break;
             int nn = Integer.parseInt(line), count=0;
             if(nn==0)break;
                for(int i=5; i<nn;i*=5){
                    count+=nn/i;
                }
                System.out.println(count);
             }
             
         }catch(Exception e){}         
     }
   
 }