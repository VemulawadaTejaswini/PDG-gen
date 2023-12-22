import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map ans = new HashMap();
        int[] ansln = new int[N+1];

        Set[] connectSet = new Set[N+1];

        for(int i=0;i<N+1;i++){
            connectSet[i] = new HashSet();
            ans.put(i,0);
            ansln[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<M;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            connectSet[A].add(B);
            connectSet[B].add(A);
        }

        Deque<DataSet> que = new ArrayDeque<>();
        que.push(new DataSet(1,1,connectSet[1]));

        while(!que.isEmpty()){
            DataSet ds = que.poll();

            for(Iterator it = ds.S.iterator(); it.hasNext(); ) {
                int i = (int)it.next();
                if(ansln[i] > ds.len){
                    ans.put(i,ds.i);
                    ansln[i] = ds.len;
                    que.push(new DataSet(i,ds.len+1,connectSet[i]));
                }
            }
        }

        for(int i=2;i<N+1;i++){
            if(ansln[i] == Integer.MAX_VALUE){
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
        for(int i=2;i<N+1;i++){
            System.out.println(ans.get(i));
        }

    }

}

class DataSet {

    int i;
    int len;
    Set S;

    public DataSet(int i,int len,Set S){
        this.i = i;
        this.len = len;
        this.S = S;

    }
}







