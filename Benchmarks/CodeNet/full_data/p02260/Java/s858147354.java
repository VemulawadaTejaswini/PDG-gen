import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] array = new int[n];
            for(int i = 0; i<n; i++){
                array[i] = sc.nextInt();
            }
        for(int i=0; i<array.length-1; i++){
            int min = array[i];
            for(int j= i; j<array.length-1; j++){
                if(array[j] < min){
                    min = j;
                    int a = array[i];
                    int b = array[min];
                    int tmp = 0;
                    tmp = a;
                    a   = b;
                    b   = tmp;
                    count += 1;
                }
            }
        }
        for(int k=0; k<array.length-1; k++){
            int number = array[k];
            System.out.print(number + " ");
        }
        System.out.println(array[array.length-1]);
        System.out.println(count);
        
    }
}