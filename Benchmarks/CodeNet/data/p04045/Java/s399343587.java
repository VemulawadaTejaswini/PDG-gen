import java.util.*;
public class Main{

  public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   StringBuilder sb=new StringBuilder();
   int n=no.nextInt();
   int m=no.nextInt();
   int min=0;
   int arr[]=new int[10];
   for(int i=0;i<m;i++){
     arr[no.nextInt()]++;
   }
   int j=n;
   int u=j;
   for(j=n;j<10000;j++){
    //System.out.println(j);
    u=j;
     while(u!=0){
       if(arr[u%10]>0){
         break;
       }
       else{
         //System.out.println("h");
         u=u/10;
       }
     }
     if(u==0){
       break;
     }
   }
   if(u==0){
     System.out.println(j);
   }
  }

}