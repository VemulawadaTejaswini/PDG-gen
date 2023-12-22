/**
 * Created by akensho on 2015/11/22.
 */
import java.util.*;
class InsertionSort {
    static int n;
    static int[] a;
    public static void main(String[] args){
        read();
        insertionSort(a);
    }

    static void read(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    /**
     * ?????\??????????????????????????????
     * @param array := 0-indexed ??§ N ??????????´????????????????
     * return ????????????????????????
     */
    static int[] insertionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int v = array[i];
            int j = i-1;
            while ( j >= 0 && array[j] > v ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = v;
            traceArray(array);
        }
        return array;
    }

    static void traceArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if (i - 1 == array.length) {
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}