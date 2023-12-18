import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] x = new Integer[n];
        Integer[] y = new Integer[n];
        Integer[] xy = new Integer[n];
        
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
         for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
         for(int i = 0; i < n; i++){
            xy[i] = x[i] - y[i];
        }
        Arrays.sort(xy, Collections.reverseOrder());
        int counter = 0;
        
        for(int i = 0; i < n; i++){
            if(xy[i] > 0){
                counter++;
            }else{
                
            }
        }
        int kekka = 0;
        for(int i = 0; i < counter; i++){
            kekka += xy[i];
        }
        
        System.out.println(kekka);
    }
}
