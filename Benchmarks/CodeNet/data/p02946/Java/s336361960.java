import java.util.*;
import java.io.*;

public class Main {
    static void printArray(int[] ans){
        for(int i=0; i<ans.length-1; i++) System.out.printf("%d ", ans[i]);
        System.out.printf("%d\n", ans[ans.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        int[] ans = new int[2*K-1];
        for(int i=0; i<ans.length; i++) ans[i] = X-K+1+i;
        printArray(ans);
    }
}