

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
 

public class Main{
          
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[]=line.split(" ");
                int n=Integer.parseInt(spl[0]);
                line = br.readLine(); //System.out.println(line);
                
                if(line.contains("  ")){spl=line.split("  ");}
                else {spl=line.split(" ");}
                 System.out.println(Arrays.toString(spl));
                System.out.println(spl.length);
                 int ns[]= new int[n]; for(int i=0;i<n;i++)ns[i]=Integer.parseInt(spl[i].trim());
                //sort
                printArray(ns);
                for(int i=1;i<n;i++){
                    int key=ns[i]; int j;
                    for(j=i-1;j>=0&&ns[j]>key;j--){
                        if(ns[j]>key){ns[j+1]=ns[j];}
                    }
                    ns[j+1]=key;
                    printArray(ns);
                }
                
             }
         }catch(Exception e){e.printStackTrace();}         
     }  
     static void printArray(int[] ns){
         String str=""; for(int i=0;i<ns.length;i++)str+=ns[i]+" "; str=str.trim();
         System.out.println(str);
     }
     
}