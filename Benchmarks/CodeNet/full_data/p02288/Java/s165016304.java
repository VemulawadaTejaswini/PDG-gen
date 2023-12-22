import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count+1];
        for(int i=1;i<=count;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=count/2;i>0;i--){
            MaxHeap(arr,i);
        }

        for(int i=1;i<=count;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }
/*
     3
  11     6
9   4
 */
    public static void MaxHeap(int[] arr,int i){//3 4 6 9 11
       int left = 2*i;
       int right = 2*i+1;
       int largest;
       if(left<=arr.length-1&&arr[left]>arr[i]){
           largest = left;
       }else{
           largest = i;
       }
       if(right<=arr.length-1&&arr[right]>arr[largest]){
           largest = right;
       }
       if(largest!=i){
           swap(arr,i,largest);
           MaxHeap(arr,largest);
       }

    }

    public static void swap(int a[], int i, int largest){
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
    }


}

