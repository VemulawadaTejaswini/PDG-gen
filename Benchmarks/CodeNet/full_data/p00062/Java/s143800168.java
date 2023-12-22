
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
                for(int i=0;i<10;i++)ints[i]=Integer.parseInt(line.charAt(i)+"");
                while(!func()){}
                 
                 
             }
             
         }catch(Exception e){}         
     }
     static boolean func(){
         //System.out.println(Arrays.toString(ints));
         int prevLen=ints.length;
         if(ints.length==1){System.out.println(ints[0]);return true;}
         int[] nex=new int[prevLen-1];
         for(int i=0;i<prevLen-1;i++){
             nex[i]=(ints[i]+ints[i+1])%10;
         }
         ints=nex;
         return false;
     }
    
 }