import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];
        int[] b = new int[m];
        int o = 0;
        for(int i = 0; i < m; i++){
            a[i] = ++o;
        }
        for(int i = m - 1; i >= 0; i--){
            b[i] = ++o;
        }
        for(int i = 0; i < m; i++){
            System.out.println(a[i] +" "+ b[i]);
        }

    }
}
