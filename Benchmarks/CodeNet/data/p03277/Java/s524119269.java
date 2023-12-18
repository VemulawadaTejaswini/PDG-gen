import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] asort = new int[n];
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            asort[i] = a[i];
        }
        sc.close();

        Arrays.sort(asort);

        int l = -1, r = n;
        long mans = 0;
        int m = (n*(n+1))%4 == 0 ? n*(n+1)/4 : n*(n+1)/4 + 1;

        while(r > l+1){
            int mid = (l+r)/2;
            int amid = asort[mid];
            for(int i=0; i<n; i++){
                if(amid >= a[i]){
                    s[i] = 1;
                }else{
                    s[i] = -1;
                }
            }
            for(int i=1; i<n; i++){
                s[i] = s[i-1] + s[i];
            }
            BinaryIndexTree bit = new BinaryIndexTree(2*n+1);
            mans = 0;
            for(int i=0; i<n; i++){
                mans += bit.sum(s[i] + n);
                bit.add(s[i]+n, 1);
            }
            if(mans >= m){
                r = mid;
            }else{
                l = mid;
            }
        }

        System.out.println(asort[r]);
    }
}

class BinaryIndexTree{
    private int[] bit;
 
    public BinaryIndexTree(int size){
        bit = new int[size];
    }

    public int sum(int i){
        int s = 0;
        while(i > 0){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x){
        while(i < bit.length){
            bit[i] += x;
            i += i & -i;
        }
    }
}