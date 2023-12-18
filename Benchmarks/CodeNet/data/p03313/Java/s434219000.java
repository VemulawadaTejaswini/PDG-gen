import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class Main{

    static class RMQ{
        long data[][];
        int N;
        
        RMQ(int n){
            N=1;
            while(N<n)N*=2;
            data = new long[N*2][2];
        }

        void set(int x, long d){
            x += N;
            data[x][0]=d;
            data[x][1]=0;
            long[] tmp = new long[4];
            for(x/=2;x>0;x/=2){
                tmp[0]=data[x*2][0];
                tmp[1]=data[x*2][1];
                tmp[2]=data[x*2+1][0];
                tmp[3]=data[x*2+1][1];
                Arrays.sort(tmp);
                data[x][0]=tmp[3];
                data[x][1]=tmp[2];
            }
        }

        long[] get(int l, int r, int k, int a, int b){
            if(l<=a&&b<=r)return data[k];
            if(r<=a||b<=l)return new long[2];

            long[] tmp = new long[4];
            long[] d1 = get(l, r, 2*k, a, (a+b)/2);
            long[] d2 = get(l, r, 2*k+1, (a+b)/2, b);
            tmp[0]=d1[0];
            tmp[1]=d1[1];
            tmp[2]=d2[0];
            tmp[3]=d2[1];
            Arrays.sort(tmp);
            d1[0]=tmp[3];d1[1]=tmp[2];
            return d1;
        }

        long get(int l, int r){
            long[] res = get(l, r, 1, 0, N);
            return res[0]+res[1];
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        RMQ rmq = new RMQ((1<<N));
        long[] a = new long[(1<<N)];
        for(int i=0;i<(1<<N);++i)a[i]=scan.nextLong();
        for(int i=0;i<(1<<N);++i)rmq.set(i, a[i]);
        int maxind[][] = new int[(1<<N)][2];
        Set<Integer> index = new HashSet<>();
        for(int i=1;i<(1<<N);++i){
            index.clear();
            index.add(i);
            maxind[i][0]=-1;
            for(int j=N;j>=0;--j){
                if(((i>>j)&1)==1){
                    index.add(maxind[i^(1<<j)][0]);
                    index.add(maxind[i^(1<<j)][1]);
                }
            }
            Iterator itr = index.iterator();
            while(itr.hasNext()){
                int ind = (int)itr.next();
                if(maxind[i][0]==-1 || a[ind]>a[maxind[i][0]]){
                    maxind[i][1]=maxind[i][0];
                    maxind[i][0]=ind;
                }else if(maxind[i][1]==-1 || a[ind] > a[maxind[i][1]]){
                    maxind[i][1]=ind;
                }
            }
        }


        PrintWriter out = new PrintWriter(System.out);
        for(int K=1;K<(1<<N);++K){
            long res = 0;
            int base = 0;
            for(int j=N;j>=0;--j){
                if(((K>>j)&1)==1){
                    res = Math.max(res, rmq.get(base, base+(1<<j)));
                    base += (1<<j);
                }
            }
            out.println(Math.max(res, a[maxind[K][0]]+a[maxind[K][1]]));
        }
        out.flush();out.close();
    }
}