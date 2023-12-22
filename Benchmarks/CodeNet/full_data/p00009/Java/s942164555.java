import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static boolean[] prime_num_count(int n){
        boolean array[] = new boolean[n+1];
        for (int i = 0; i < n+1; i++){
            if (i==0||i==1){
                array[i]=false;
            }else{
                array[i] = true;
            }
        }
        int cnt = 0;
        int k = 2;
        while (k*k <= n){
            if (array[k]){
                int j = k + k;
                while (j <= n){
                    array[j] = false;
                    j += k;
                }
            k +=1;
            }
        }
        return array;
    }    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            boolean a[] = prime_num_count(n);
            
            int c = 0;
            for (int ii = 0; ii < n+1; ii++){
                if (a[ii] == true){
                    c ++;
                }
            }
            System.out.println(c);
        }
    }
}