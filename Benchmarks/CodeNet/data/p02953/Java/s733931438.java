
import java.util.Scanner;
  class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt();
        int arr[] = new int[n+1] ;
        for(int i = 1 ; i<=n ;i++){
           arr[i] = scan.nextInt();
        }
        for(int i =1  ; i<=n ; i++){
            if(arr[i] > arr[i-1]){
               
                arr[i]--;
               
            } 
        }
        int count =  0 ; 
        for(int i = 1 ; i< n ;i++){
            if(arr[i] > arr[i+1]){
                count ++ ;
            }
        }
        if(count == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
