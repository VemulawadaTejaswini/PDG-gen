import java.util.Scanner;

class Main{
   private static int n,min,max,ip;
   private static long sum;

    
  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
   
  n=s.nextInt();
  ip=s.nextInt();
     min=ip;
      max=ip;
      sum=ip;
  for(int i=0;i<n;i++){
      
      ip=s.nextInt();
      
      
       if(max<ip){
          max=ip;
      }
      
      if(min>ip){
          min=ip;
      }
     sum+=ip;
      
  }
      System.out.println(min+" "+max+" "+sum);
      
      
  }}
