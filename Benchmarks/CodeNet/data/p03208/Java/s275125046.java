import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        Arrays.sort(h);
        int out = Integer.MAX_VALUE;
        for(int i = 0; i < n - 2; i++){
            if(h[i + 2] - h[i] < out) out = h[i + 2] - h[i];
        }
        System.out.println(out);
        scan.close();
    }
}