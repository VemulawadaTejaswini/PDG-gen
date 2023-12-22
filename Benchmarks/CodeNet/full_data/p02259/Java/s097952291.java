import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void checkArray(int[] a){
        int i ;
        for( i = 0; i < a.length -1; i++){
                System.out.print(a[i] +" ");
        }
        System.out.print(a[i]);
        System.out.println();
    }

    static int[] makeArray(int num){
        int[] arr = new int[num];
        for( int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    } 

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] arr = makeArray(N);
       
        int temp;
        int count=0;
        boolean flag = true;
        
        for(int j = 0; flag; j++ ){
            flag = false;
            for(int i = N-1; i >= j+1 ; i--) {
                temp = arr[i];
                if(arr[i] < arr[i-1]) {
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    count++;
                    flag = true;
                }
                
            }
        }
        checkArray(arr);
        System.out.println(count);
    }
    
}