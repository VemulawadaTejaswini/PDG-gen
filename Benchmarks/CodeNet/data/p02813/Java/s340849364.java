import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] Pi=null;
        int[] Qi = null;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Pi = new int[N];
            Qi = new int[N];

            for (int i = 0; i < N; i++) {
                Pi[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                Qi[i] = sc.nextInt();
            }

        }
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        int a =0;
        int b =0;
        int index = 1;
        while(intNextPermutation(arr)){
            if(compare(arr,Pi) ){
                a = index;
            }
            if(compare(arr,Qi)){
                b = index;
            }
            index++;
        }
        System.out.println(Math.abs(a -b));
    }

    public static boolean compare(int[] a,int[] b){
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean intNextPermutation(int[] arr){
        int size = arr.length;
        for (int i = size - 2; i >=0; i--) {
            if(arr[i] < arr[i+1]){
                int j = size;
                do{
                    j--;
                }while (!(arr[i] < arr[j]));
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                Arrays.sort(arr,i+1,size);
                return true;
            }
            if(i == 0){
                int[] temp = Arrays.copyOf(arr,size);
                for (int j = 0; j < size; j++) {
                    arr[j] = temp[(size-1) -j];
                }
            }
        }
        return false;
    }
}
