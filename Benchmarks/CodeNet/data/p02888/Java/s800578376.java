import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(sc.next());
        }
        sort(l, 0, n-1);
        long cnt = 0;
        for(int i=0;i<n-2;i++){
            int a = l[i];
            for(int j=i+1; j<n-1; j++){
                int b = l[j];
                for(int k=j+1;k<n;k++){
                int c = l[k];
                if(a<b+c){
                    cnt++;
                    continue;
                }
                break;
                }
                continue;
            }
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