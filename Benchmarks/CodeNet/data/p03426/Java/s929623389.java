import java.util.*;
class Main{
    /*
     * 整数 -> nextInt() (遅い場合は下のni())
     * 単語 -> next()
     * 1行 -> nextLine()
     * 注意 : nextLIneをnext(),nextInt()のあとに呼び出す場合、次が改行だと改行だけ取ってしまうので注意
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int[][] a = new int[H][W];

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                a[i][j] = sc.nextInt() - 1;
            }
        }

        int Q = sc.nextInt();
        int[] L = new int[Q];
        int[] R = new int[Q];

        for(int i=0;i<Q;i++){
            L[i] = sc.nextInt() - 1;
            R[i] = sc.nextInt() - 1;
        }

        Map<Integer,Pair> mp = new HashMap<>();
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                mp.put(a[i][j],new Pair(i,j));
            }
        }

        int[][] sum = new int[D][H*W/D+10];

        for(int i=0;i<D;i++){
            for(int j=0;i+j*D<H*W;j++){
                if(j==0){
                    sum[i][j] = 0;
                }else{
                    Pair p1 = mp.get(i+(j-1)*D);
                    Pair p2 = mp.get(i+j*D);
                    sum[i][j] = sum[i][j-1] + Math.abs(p1.a-p2.a) + Math.abs(p1.b-p2.b);
                }
            }
        }


        for(int i=0;i<Q;i++){
            int l = L[i];
            int r = R[i];

            int li = l / D;
            int ri = r / D;

            System.out.println(sum[r%D][ri] - sum[l%D][li]);
        }
    }

    static class Pair{
        int a,b;
        public Pair(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
}
