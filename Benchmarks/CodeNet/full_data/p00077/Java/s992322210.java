


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             char[] chrs = line.toCharArray();
             StringBuilder sb = new StringBuilder("");
             for(int i=0; i<chrs.length;i++){
                 if(chrs[i]=='@'){
                     i++;int n=Integer.parseInt(chrs[i]+"");i++;
                     for(int j=0; j<n; j++){
                         sb.append(chrs[i]);
                     }
                 }else {sb.append(chrs[i]);}
             }
                System.out.println(sb.toString());
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  