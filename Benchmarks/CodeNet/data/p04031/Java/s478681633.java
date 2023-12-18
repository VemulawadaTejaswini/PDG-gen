import java.util.*;
public class Main {

  public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   int a=no.nextInt();
   int arr[]=new int[a];
   int min=Integer.MAX_VALUE;
   int max=Integer.MIN_VALUE;
   double sum=0;
   for(int i=0;i<a;i++){
     arr[i]=no.nextInt();
     if(arr[i]<min){
       min=arr[i];
     }
     if(arr[i]>max){
       max=arr[i];
     }
   }
   if(min==max){
     sum=0;
   }
   else{
     int y=(min+max+1)/2;
     for(int i=0;i<a;i++){
       sum=sum+Math.pow(((double)arr[i]-(double)y),2);
     }
   }
   System.out.println((int)sum);
  }

}