
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int xor = 0;

        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            xor ^= a[i];
        }
        for(int i=0; i<n; i++) {
            res[i] = xor ^ a[i];
        }
        for(int i=0; i<n; i++) {
            if(i>0) {
                System.out.print(" ");
            }
            System.out.print(res[i]);
        }
        System.out.println();


    }



}