import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n; i++){
            out += (int)(Math.min(Math.abs(k - x[i]), x[i])) * 2;
        }
        System.out.println(out);
        scan.close();
    }
}