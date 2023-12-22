import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void nibutan(int array[], int length, int num){
        int pos = -1;
        int lower = 0; //最小index番号
        int upper = length - 1; // 最大index番号
        
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            
            if (array[mid] >= num) {
                upper = mid;
            } else if (array[mid] < num) {
                lower = mid;
            }
            
            if(upper - lower == 1){
                if(array[lower] < num && array[upper] >= num){
                    pos = upper;
                }else if(array[lower] >= num){
                    pos = 0;
                }else{
                    pos = length;
                }
                break;
            }
            
            if(upper == lower){
                if(array[0] < num){
                    pos = length;
                }else{
                    pos = 0;
                }
                break;
            }
        }
        
        System.out.println(pos);
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){ 
            a[i] = stdIn.nextInt();
        }
        
        int q = stdIn.nextInt();
        
        for(int i = 0; i < q; i++){
            int k = stdIn.nextInt();
            nibutan(a, n, k); //左から配列、配列の長さ、探索する数字
        }
        
        stdIn.close();
    }
}

