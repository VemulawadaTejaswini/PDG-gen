import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),ans;
        int[] p = new int[n];
        int[] q = new int[n];
        for(int i = 0;i < n;i++){
            p[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
            q[i] = sc.nextInt();
        ans = Math.abs(rank(p) - rank(q));
        System.out.println(ans);

    }

    static int rank(int[] array){
        int ret = 0;
        int len = array.length;
        for(int i = 0;i < len-1;i++){
            int add = 0;
            for(int j = i + 1;j < len;j++){
                if(array[i] > array[j])
                    add++;
            }
            ret += add;
            ret *= (len - i -1);
        }
        return ret;
    }
}