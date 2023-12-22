import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String[] strAry; 
 int x,i,tmp;
 strAry = br.readLine().split(" ");
 x = Integer.parseInt(strAry[0]);
  for(i=1;i<x;i++){
   if(i%3==0){
    System.out.print(i+" ");
   }
   tmp=i;
   while(tmp!=0){
     if(tmp%10==3){    
      System.out.print(i+" ");      
     }
    tmp =tmp/10; 
   }
  }
  System.out.print("\n");  
  
 }
}