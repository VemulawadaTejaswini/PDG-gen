import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int l = 1;
        int r = 1000000000;

        while(l < r){
            int mid = (r - l) / 2 + l;
            if(judge(mid, k, a)){
                r = mid;
            }else{
                l = mid + 1;
            }
            //System.out.println(l +" "+ r);
        }

        System.out.println(l);

    }

    static boolean judge(int l, int k, int[] a){
        int c = 0;
        for(int b : a){
            c += Math.ceil((double)b / l) - 1;
            if(c > k){
                return false;
            }
        }
        return true;
    }

}
