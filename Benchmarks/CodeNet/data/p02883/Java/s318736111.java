import java.util.*;
import java.util.Collections;

public class Main {
    
    public static void sort(int array[], int array2[], int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    
                    int tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, left, r);
            Main.sort(array, array2, l, right);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int max = 0;
        int a[] = new int[n];
        int f[] = new int[n];
        int time[] = new int[n];
        int aaa[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            f[i] = stdIn.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(f);
        
        for(int i = 0; i < n; i++){
            time[i] = f[i] * a[i];
            aaa[i] = a[i];
        }
        
        Main.sort(time, aaa, 0, n - 1);
        
        for(int i = 0; i < k; i++){
            System.out.println(time[0]);
            System.out.println(time[1]);
            System.out.println(time[2]);
            System.out.println(time[n - 1] +" " + aaa[n - 1]);
            System.out.println();
        
            time[n - 1] -= aaa[n - 1];
            
            //if(k > n - 1){
                Main.sort(time, aaa, 0, n - 1);
            //}else{
                //Main.sort(time, aaa, n - 1 - k, n - 1);
            //}
        }
        
        Main.sort(time, aaa, 0, n - 1);
        
        System.out.println(time[0]);
        System.out.println(time[1]);
        System.out.println(time[2]);
        System.out.println();
        
    }
}