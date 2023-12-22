import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
   longint n,max,min,sum;
    n = br.readLine(); 
   int i;   
   String[] strAry = str.split(" ");
   min = Integer.parseInt(strAry[0]);  
   max = Integer.parseInt(strAry[0]);
   
     
   
   for(i=0,sum=0;i<n;i++){
     sum=sum + strAry[i];
     if(min>strAry[i]){ 
       min=strAry[i];
     }
     if(max<strAry[i]){
       max=strAry[i];
      }
      
   }
       
      System.out.println(min+ " " + max +" "+sum);   

  }
}