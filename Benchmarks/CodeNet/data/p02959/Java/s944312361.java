
import java.util.Scanner;

 
  class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int arr[] = new int[n+1];
        int arr2[] = new int[n];
        
        for(int i = 0 ; i<n+1 ; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0 ; i < n ;i++){
            arr2[i] = scan.nextInt();
        }
        int count = 0 ;
        for(int i = 0 ; i< n ;i++){
            int a = Math.min(arr[i],arr2[i]);
            if(a == arr[i]){
                count +=a ;
                int b = Math.max(arr[i],arr2[i]) - Math.min(arr[i],arr2[i]);
                if(arr[i+1] > b){
                    count+=b;
                    arr[i+1] = arr[i+1] - b ;
                }else{
                    count+=arr[i+1]; 
                    arr[i+1] = 0 ;
                }
                
            }else{
                count +=a ;
            }
        }
        System.out.println(count);
    }
}
