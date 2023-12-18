import java.util.Scanner;

class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int arr[] = new int[N];
        int arr2[] = new int[N+1];
        arr2[0] = 0 ;
        for(int i =0 ; i <N ;i++){
            arr[i] = scan.nextInt() ;
        }
        
        for(int i = 0 ; i < N ;i++){
            arr2[i+1] = arr2[i]+arr[i];       
        }
        int i = 0 ,count = 0 ;
        while(arr2[i] <= X){
            count++;
            i++ ;
        }
        System.out.println(count);
      
    }
}
