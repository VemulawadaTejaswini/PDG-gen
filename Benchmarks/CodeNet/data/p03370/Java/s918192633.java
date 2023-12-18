import java.util.*;
class Main{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in) ;
        int n =scan.nextInt();
        int x = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0 ;
        int min = 99999 ;
        for(int i = 0 ; i<n ; i++){
            arr[i] = scan.nextInt();
            sum+=arr[i] ;
            if(arr[i] < min){
                min = arr[i] ;
            }
        }
        
        int rest = x - sum ;
        int possible = rest/min ;
        System.out.println(possible+n);
        
     }
}