
/*
 *   
 *   Date: 07 September 2019
 *   Time: 01:03:00
*/
import java.io.*; 
import java.util.*;


   
 class Main
{   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextLong();
        }
        long max=arr[0];
        long diff=0;
        for(int i=1;i<n;i++){
        	if(arr[i]>=max){
        		        		max=arr[i];

        		continue;
        	}else{
        		diff+=max-arr[i];
        		arr[i]=max;;
        	}
        }
       
        System.out.println(diff);
     
        
       

       
    } 
} 
 
 
 
