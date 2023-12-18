import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = scanner.nextInt();
        }
        for(int j = 0; j < n; j++){
            q[j] = scanner.nextInt();
        }
        int[] C = new int[n];
        for(int i = 0; i < n; i++){
            C[i] = i+1;
        }
        int a = -1;
        int b = -1;
        int count = 1;
        do{
            boolean aflag = true;
            boolean bflag = true;
            if(a == -1){
                for(int i = 0; i < n; i++){
                    if(C[i] != p[i]){aflag = false;break;}
                }
                if(aflag){a=count;}
            }
            if(b == -1){
                for(int i = 0; i < n; i++){
                    if(C[i] != q[i]){bflag = false;break;}
                }
                if(bflag){b=count;}
            }
            if(a != -1 && b != -1){break;}
            count++;
        }while(nextPermutation(C));
        System.out.println(Math.abs(a-b));
    }

    //【参考URL】
    // http://d.hatena.ne.jp/tomerun/20081203/1228321480
    public static boolean nextPermutation(int[] a) {
    for (int i = a.length - 1; 0 < i; i--) {
      if (a[i - 1] < a[i]) {
        int index = find(a[i - 1], a, i, a.length - 1);
        int temp = a[index];
        a[index] = a[i - 1];
        a[i - 1] = temp;
        Arrays.sort(a, i, a.length);
        return true;
      }
    }
    return false;
  }

    // destより大きい要素の中で最小のもののインデックスを二分探索で探す
    private static int find(int dest, int[] a, int s, int e) {
        if (s == e) {
        return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }
}

