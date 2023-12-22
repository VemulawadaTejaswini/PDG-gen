import java.util.*;

class Text{
   public static void main(String args[]){
     try{
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
    int i;   
        double a[]=new double[]; 
for(i=0;i<t;i++)
  a[i]=in.nextDouble();
       int j;
       int count=0;
       for(i=0;i<t;i++){
         for(j==0;j<t;j++){
           if(i!=j){
             int m=a[i]*a[j];
             if(m==Math.abs(m))
               count++;
           }
         }
       }
         System.out.println(count);
       
       
     }catch(Exception e){
     System.out.print();
     }
   }
  
}