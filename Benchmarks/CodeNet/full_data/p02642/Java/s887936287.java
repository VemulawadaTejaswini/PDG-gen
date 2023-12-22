import java.util.*;

public class Main {
    public static final char SAME_EXISTS = 0x1;
    public static final char DIV_FOUND = 0x2;

    public static ArrayList<Integer> divisor(int x) {
        ArrayList<Integer> ret = new ArrayList<Integer>();    

        for(int i=2;i*i < x;i++) {
            if(x%i == 0) {
                ret.add(i);
            }
        }

        return ret;
    }
    public static int indexOf(int[] a, int x) {
        int ret = -1;
    
        int l,m,r;
        l = 0;r = a.length - 1;
    
        while(l <= r) {
            m = (l+r) / 2;
            if(a[m] == x) {
                ret = m;
                break;
            } else if(a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    
        return ret;
    }
       
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] x = new int[n];
    char[] st  = new char[n];

    for(int i=0;i<n;i++) {
        x[i] = scan.nextInt();
        st[i] = 0;
    } 

    Arrays.sort(x);
    // 同じものチェック
    int last = x[0];
    for(int i=1;i<n;i++) {
        if(last == x[i]) {
            st[i] |= SAME_EXISTS;
            if(i == 1) st[0] |= SAME_EXISTS;
        }
    }

    // 大きい方から見ていく
    for(int i=0;i<n;i++) {
        // 素数の場合 何もしない
        // 合成数の場合、約数を列挙してそれぞれ2分探索
        ArrayList<Integer> d = divisor(x[i]);
        if(d.size() == 0) continue;

        for(int j=0;j<d.size();j++) {
            int ind = indexOf(x, d.get(j));
            if(ind != -1) {
                st[i] = DIV_FOUND;
                st[ind] = DIV_FOUND; 
                break;
            }
        }
    }

    int cnt = 0;
    for(int i=0;i<n;i++) {
        if(st[i] == 0) cnt++;
    }

    System.out.println(cnt);
    scan.close();

}

};
