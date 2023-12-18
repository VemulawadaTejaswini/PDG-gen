import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] t = new int[n];
        for(int i = 0; i < n; i++){
            t[i] = scan.nextInt();
        }
        int out = s;
        for(int i = 1; i < n; i++){
            out += Math.min(t[i] - t[i - 1], s);
        }
        System.out.println(out);
    }
}