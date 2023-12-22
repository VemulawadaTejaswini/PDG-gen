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
    static int minOf(int[] a, int start) {
        int index = start;
        int min = a[start];
        for(int i = start; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
    static void swap(int[] a,int i, int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;    
    }
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] arr = makeArray(N);
        
        int index;
        int count = 0;
        for(int i = 0; i < N; i++) {
            index = minOf(arr,i);
            if(arr[index] != arr[i]) {
                swap(arr,i,index);
                count++;
            }
            
        }
        checkArray(arr);
        System.out.println(count);
    }

}