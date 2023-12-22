

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{

     static int[] dens=new int[10];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line; int totalN=0,totalV=0,count=0;
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                 String split[] = line.split(",");
                 int a = Integer.parseInt(split[0]);//val
                 int b = Integer.parseInt(split[1]);//num
                 totalV+=a*b;totalN+=b;count++;                 
             }
             double av=(double)totalN/(double)count;
             BigDecimal bi = new BigDecimal(String.valueOf(av));
             av=bi.setScale(0,BigDecimal.ROUND_HALF_UP).intValue();
             br.close();
             System.out.println(totalV);
             System.out.println((int)av);
         }catch(Exception e){}         
     }
    
 }