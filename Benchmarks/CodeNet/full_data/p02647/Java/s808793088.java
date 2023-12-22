
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n+1];
        int result[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        // for(int i = 0; i <= n; i++){
        //     result[i] = a[i];
        // }
        for(int i = 0; i < k; i++){
            if(i != 0){
                for(int x = 1; x <= n; x++){
                    a[x] = result[x];
                }
            }
            for(int y = 1; y <= n; y++){
                result[y] = 0;
            }
            for(int j = 1; j <= n; j++){
                    int light = a[j];
                    int haniPlus = j + light;
                    int haniNinus = j - light;
                    if(haniNinus < 1){
                        haniNinus = 1;
                    }
                    if(haniPlus > n){
                        haniPlus = n;
                    }
                    for(int l = haniNinus; l <= haniPlus; l++){
                            result[l]++;
                    }
                    // for(int o = 1; o <= n; o++){
                    //     System.out.print(a[o]);
                    // }
                    // System.out.println();
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print(result[i]);
            if(i != n){            
            System.out.print(" ");
            }
        }
        System.out.println();
    }
}