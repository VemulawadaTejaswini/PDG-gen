import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        int ai = a[n-1];
        int aj = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] <= ai/2){
                aj = Math.max(aj, a[i]);
            } else {
                if(ai - a[i] > aj)
                    aj = a[i];
            }
        }

        System.out.println(ai + " " + aj);
    }
}