

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            while((line=br.readLine())!=null){  if(line.equals(""))break;
                String[] splited = line.split(",");
                int[] ints = new int[10];
                for(int i=0; i<10;i++)ints[i]=Integer.parseInt(splited[i]);
               int v1 = Integer.parseInt(splited[10]), v2 = Integer.parseInt(splited[11]);
               int sumL = 0; for(int i=0;i<10;i++)sumL+=ints[i];
               double t = sumL+0.0/(v1+v2); double x = t*v1;
               int ans=0, sumTmp=0;
               for(int i=0; i<10;i++){
                   sumTmp+=ints[i];if(sumTmp<=x){ans=i+1;break;}
               }
                System.out.println(ans);
            }         
        }catch(Exception e){e.printStackTrace();}
        
    }
    
}