


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



 class Main{
     
    
    
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         try{
         
        int n =Integer.parseInt(br.readLine());
         for(int j=0; j<n;j++){
             String line = br.readLine();
             ArrayList<Integer> al = new ArrayList<Integer>();
             for(int i=0; i<line.length(); i++) al.add(Integer.parseInt(line.charAt(i)+""));
             Collections.sort(al);
             //System.out.println(Arrays.toString(al.toArray()));
             
             String maxn="";
             for(int i=0;i<line.length();i++){
                 int max=-1; 
                 for(int k=0; k<line.length()-i;k++){
                     if(max<al.get(k))max=al.get(k);
                     
                 }
                 maxn+=max+"";al.remove(al.indexOf(max));
             }
              for(int i=0; i<line.length(); i++) al.add(Integer.parseInt(line.charAt(i)+""));
             Collections.sort(al);
                          String minn="";
             for(int i=0;i<line.length();i++){
                 int min=10; 
                 for(int k=0; k<line.length()-i;k++){
                     if(min>al.get(k))min=al.get(k);
                     
                 }
                 minn+=min+"";al.remove(al.indexOf(min));
             }
             System.out.println(Integer.parseInt(maxn)-Integer.parseInt(minn));

         }
         }catch(Exception e){}
         
     }
     
 }