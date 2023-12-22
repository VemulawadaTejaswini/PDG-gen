import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        
               int x=sc.nextInt();
                
               int arr[]=new int[x];
               for(int i=0;i<x;i++){
                 arr[i]=sc.nextInt();
                 }
               if(x==1){
	System.out.println("1");
	System.exit(0);
                }
               Arrays.sort(arr);
               int count=0;
               for(int i=0;i<x;i++)
               {
                   for(int j=0;j<i;j++)
                   {
                       if(arr[i]>0 && arr[j]>0  && arr[i]%arr[j]==0)
                       {




                           count++;
                           break;
                       }
                   }
               }
               if(count>0)
               System.out.println(x-count);
               else
               System.out.print("0");
        }

     }
