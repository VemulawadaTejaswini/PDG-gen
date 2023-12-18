import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] length = new int[n];
        for(int i=0;i<n;i++){
            length[i] = Integer.parseInt(sc.next());
        }
        sort(length, 0, n-1);
        int sum=0;
        for(int i=0;i<k;i++){
            sum += length[i];
        }
        System.out.println(sum);
    }

    public static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left + right)/2];
        int l=left, r=right;
        int tmp;
        while(l<r){
            while(d[l]>p){l++;}
            while(d[r]<p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l]=d[r];
                d[r]=tmp;
                l++;r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}