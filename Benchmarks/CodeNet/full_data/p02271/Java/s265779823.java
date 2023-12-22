import java.util.*;

public class Main{
    static int n;
    static int[] A;
    static boolean res;
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = a.nextInt();
        }
        int q = a.nextInt();
        int[] m = new int[q];
        for(int i=0; i<q; i++){
            m[i] = a.nextInt();
        }
        for(int i=0; i<q; i++){
            boolean x = sub(0,m[i]);
            if(x){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    public static boolean sub(int i, int m){
        if(m == 0){
            return true;
        }
        if(i >= n){
            return false;
        }
        res = sub(i+1, m) || sub(i+1, m-A[i]);
        return res;
    }
}
