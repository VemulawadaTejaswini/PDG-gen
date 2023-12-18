import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arg = new int[n];
        for(int i=0;i<n;i++){
            arg[i] = Integer.parseInt(sc.next());
        }
        _sortInt(arg, 0, n-1);
        int asum=0, bsum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                asum += arg[i];
            }else{
                bsum += arg[i];
            }
        }
        System.out.println(asum - bsum);
    }

    // 降順クイックソート
    private static void _sortInt(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right, tmp;
        while(l<r){
            while(d[l]>p){l++;}
            while(d[r]<p){r--;}
            if(l<=r){
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++; r--;
            }
            _sortInt(d, left, r);
            _sortInt(d, l, right);
        }
    }
}