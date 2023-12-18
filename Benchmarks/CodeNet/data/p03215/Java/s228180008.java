import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =  sc.nextInt();
        
        int[] d = new int[n];
        for(int i = 0; i < n ; i++){
            d[i] = sc.nextInt();
        }
        sc.close();

        int idx = 0;
        ArrayList<Integer> ds = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++){
            for (int len = 1 ; len <= n-i ; len++){
                int sum = 0;
                for(int j = i ; j < i+len; j++){
                    sum += d[j];
                }
                ds.add(sum);
            }
        }

        Collections.sort(ds);
        Collections.reverse(ds);

        int max = ds.get(0);
        for(int i = 1; i < k ; i++){
            max = max & ds.get(i);
        }

        System.out.println(max);

    }
}
