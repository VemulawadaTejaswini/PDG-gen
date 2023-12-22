import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 1000000;
        int max = -1000000;
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
            sum += a[i];
        }
        
        System.out.println(min + " " + max + " " + sum);
        
    }
}

