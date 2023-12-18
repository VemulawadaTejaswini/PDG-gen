 

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int count = 0 ;
        int max = 0 ;
        for(int i = 0 ; i< n ;i ++){
            for(int j= i+1 ; j<n ; j++){
                if(arr[j]<=arr[j-1]){
                    count++;
                }else
                    break;
            }
           if(count>max)max=count; 
           count = 0; 
        }
        
        System.out.println(max);
    }
}
