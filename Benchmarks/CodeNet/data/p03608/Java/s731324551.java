import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力                                                                                                                   
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int K = 0;
        int a[] = new int[M];
        int b[] = new int[M];
        int c[] = new int[M];
        int r[] = new int[R];
        int i;
        int s, t;
        int ans=0;
        int l;
        int R2 = R*(R-1)/2;
        int a2[] = new int[R2];
        int b2[] = new int[R2];
        long c2[] = new long[R2];
        int m;
        int n=0;
        for(i=0;i<R;i++) r[i] = sc.nextInt()-1;
        for(i=0;i<M; i++){
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
        }
        for(l=0;l<R-1;l++){
            for(m=l+1;m<R;m++){
                K = r[l]; // todo                                                                                                       
                a2[n] = l;
                b2[n] = m;
                long d[] = new long[N];
                int prev[] = new int[N];
                Set<Integer> vert = new HashSet<>();
                for(i=0;i<N;i++){
                    vert.add(i);
                    d[i] = -1;
                    prev[i] = -1;
                }
                d[K] = 0;
                while(!(vert.isEmpty())){
                    long min = -1;
                    int j = -1;
                    int temp = -1;
                                      for(int v : vert){
                        temp = v;
                        if(min == -1 || (d[v] < min && d[v] != -1)){
                            min = d[v];
                            j = v;
                        }
                    }
                    if(min == -1) j = temp; // 全部-1だった時は最後に見たノードを対象にする。実際はそんなことはおきない。               
                    vert.remove(j);
                    for(i = 0; i<M; i++){
                        if(a[i] == j){
                            if(d[b[i]] == -1 || d[b[i]] > d[j] + c[i]){
                                d[b[i]] = d[j] + c[i];
                                prev[b[i]] = j;
                            }
                        }else if(b[i] == j){
                            if(d[a[i]] == -1 || d[a[i]] > d[j] + c[i]){
                                d[a[i]] = d[j] + c[i];
                                prev[a[i]] = j;
                            }
                        }
                    }
                    if(j==r[m]){
                        c2[n]=d[r[m]];
                        n++;
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(c2));

    }
}
