import java.util.*;
public class Main {

 public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   int n=no.nextInt();
   int m=no.nextInt();
   int arr[]=new int[n];
   int sum=0;
   for(int i=0;i<n;i++){
     arr[i]=no.nextInt();
   }
   for(int i=0;i<n-1;i++){
     if(arr[i]+arr[i+1]<=m){
       continue;
     }
     else if(arr[i]+arr[i+1]>m){
      /* if(arr[i]<arr[i+1]){
         while(arr[i]+arr[i+1]>m&&arr[i]!=0){
           arr[i]=arr[i]-1;
           sum++;
         }
         if(arr[i]+arr[i+1]>m){
           while(arr[i]+arr[i+1]>m&&arr[i+1]!=0){
             arr[i+1]=arr[i+1]-1;
             sum++;
           }
         }
       }
       else{*/
         while(arr[i]+arr[i+1]>m&&arr[i+1]!=0){
             arr[i+1]=arr[i+1]-1;
             sum++;
         }
           if(arr[i]+arr[i+1]>m){
            while(arr[i]+arr[i+1]>m&&arr[i]!=0){
             arr[i]=arr[i]-1;
             sum++;
            }
           }
       } 
     }
   System.out.println(sum);
 }

}