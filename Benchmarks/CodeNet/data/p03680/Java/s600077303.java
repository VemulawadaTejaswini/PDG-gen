import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int b = 0;
        int out = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            out++;
            b = a[b] - 1;
            if(a[b] == 2){
                out++;
                System.out.println(out);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}