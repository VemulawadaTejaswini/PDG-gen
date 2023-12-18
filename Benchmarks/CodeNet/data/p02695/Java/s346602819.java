import java.util.*;

public class Main{

    private static int m;
    private static int n;;
    private static int max;
    private static int q;
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int[] d;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];

        for(int i = 0; i < q; i++){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        int[] A = new int[n];
        Arrays.fill(A, 1);
        max = 0;
        array(A, n - 1);

        System.out.println(max);

    }

    static void array(int[] A, int x){
        if(-1 == x){
            //System.out.println(Arrays.toString(A));
            if(judge(A)){
                int point = 0;
                for(int i = 0; i < q; i++){
                    if(A[b[i]] - A[a[i]] == c[i]){
                        point += d[i];
                    }
                }
                max = Math.max(max, point);
                //System.out.println(point);

            }

            return;
        }


        if(x == n - 1){
            for(int i = 1; i <= m; i++){
                A[x] = i;
                array(A, x - 1);
            }

        }else{
            for(int i = A[x + 1]; i > 0; i--){
                A[x] = i;
                array(A, x - 1);
            }
        }

    }

    static boolean judge(int[] A){
        int n = A[0];
        for(int i = 1; i < A.length; i++){
            if(n <= A[i]){
                n = A[i];
            }else{
                return false;
            }
        }
        return true;
    }

}
