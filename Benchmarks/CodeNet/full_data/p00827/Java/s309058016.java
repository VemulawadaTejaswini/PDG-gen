import java.util.*;

class Main{

    int INF = Integer.MAX_VALUE;
    int max = 5000000;
    int[] x = new int[max+1];
    int[] y = new int[max+1];

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            if(a==0 && b==0 && d==0) break;

            for(int i=1; i<=max; i++){
                x[i] = INF;
                y[i] = INF;
            }

            for(int i=0; i<=max; i++){
                if(i-a>=0 && x[i-a]!=INF){
                    if(x[i]==INF || x[i]+y[i]>x[i-a]+y[i-a]+1){
                        x[i] = x[i-a] + 1;
                        y[i] = y[i-a];
                    }else if(x[i]+y[i]==x[i-a]+y[i-a]+1){
                        long n1 = (x[i-a]+1) * a + y[i-a] * b;
                        long n2 = x[i] * a + y[i] * b;
                        if(n1>=n2) continue;
                        x[i] = x[i-a] + 1;
                        y[i] = y[i-a];
                    }
                }
                if(i-b>=0 && x[i-b]!=INF){
                    if(x[i]==INF || x[i]+y[i]>x[i-b]+y[i-b]+1){
                        x[i] = x[i-b];
                        y[i] = y[i-b] + 1;
                    }else if(x[i]+y[i]==x[i-b]+y[i-b]+1){
                        long n1 = x[i-b] * a + (y[i-b]+1) * b;
                        long n2 = x[i] * a + y[i] * b;
                        if(n1>=n2) continue;
                        x[i] = x[i-b];
                        y[i] = y[i-b] + 1;
                    }
                }
            }

            int minx = INF;
            int miny = INF;

            for(int i=d; i<=max; i++){
                int n1 = i;
                int n2 = i-d;

                if(x[n1]==INF || x[n2]==INF) continue;

                int xx = x[n1] + x[n2];
                int yy = y[n1] + y[n2];
                if(minx==INF || xx+yy<minx+miny){
                    minx = xx;
                    miny = yy;
                }else if(xx+yy==minx+miny){
                    long nn1 = xx * a + yy * b;
                    long nn2 = minx * a + miny * b;
                    if(nn1<nn2){
                        minx = xx;
                        miny = yy;
                    }
                }
            }

            System.out.println(minx+" "+miny);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}