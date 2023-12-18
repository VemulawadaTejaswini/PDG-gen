import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = Integer.parseInt(sc.next());
        int  k = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int cnt = 0;
        for (int i=0;i<n;i++) {
            if(h[i]>=k)cnt++;
        }
        System.out.println(cnt);
        
    }
    
    private static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        int tmp;
        while(l<=r){
            while(d[l]>p){l++;}
            while(d[r]<p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++; r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}