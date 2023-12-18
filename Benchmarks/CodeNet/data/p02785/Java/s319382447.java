import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        if(n < k){
            System.out.println(0);
            return;
        }
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        Arrays.sort(h);
        int out = 0; 
        for(int i = n - k; i < n; i++){
            out += h[i];
        }
        System.out.println(out);
        scan.close();
    }
}