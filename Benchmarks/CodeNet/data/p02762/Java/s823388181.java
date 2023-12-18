import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer,ArrayList<Integer>> FL = new HashMap<>();
        Map<Integer,ArrayList<Integer>> BL = new HashMap<>();
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(FL.get(a)==null){
                ArrayList<Integer> L = new ArrayList<>();
                L.add(b);
                FL.put(a,L);
            }
            else FL.get(a).add(b);
            if(FL.get(b)==null){
                ArrayList<Integer> L = new ArrayList<>();
                L.add(a);
                FL.put(b,L);
            }
            else FL.get(b).add(a);
        }
        for(int i=0;i<K;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(BL.get(a)==null){
                ArrayList<Integer> L = new ArrayList<>();
                L.add(b);
                BL.put(a,L);
            }
            else BL.get(a).add(b);
            if(BL.get(b)==null){
                ArrayList<Integer> L = new ArrayList<>();
                L.add(a);
                BL.put(b,L);
            }
            else BL.get(b).add(a);
        }
        System.out.println(FL);
        System.out.println(BL);
        for(int i=1;i<=N;i++){
            ArrayList<Integer> L =new ArrayList<>();
            int [] check = new int[N+1];
            Arrays.fill(check,0);
            check[i]=1;
            DFS(i,i,check,FL,BL,L,N);
            if(i!=N)System.out.print(L.size()+" ");
            else System.out.println(L.size());
        }
    }
    public static void DFS(int source,int now,int [] check,Map<Integer,ArrayList<Integer>> FL,Map<Integer,ArrayList<Integer>>BL,ArrayList<Integer> L,int N){
        for(int i=1;i<N+1;i++){
            if(FL.get(now)!=null) {
                if (FL.get(now).contains(i) && check[i] == 0) {
                    check[i] = 1;
                    DFS(source, i, check, FL, BL, L, N);
                }
            }
        }
        if(FL.get(source)!=null){
            if(BL.get(source)!=null){
                if(!FL.get(source).contains(now)&&!BL.get(source).contains(now)&&source!=now) {
                    //System.out.println("source(a):"+source+"-now:"+now);
                    L.add(now);
                }
            }
            else{
                if(!FL.get(source).contains(now)&&source!=now) {
                    //System.out.println("source(b):"+source+"-now:"+now);
                    L.add(now);
                }
            }
        }
        else if(source!=now){
            //System.out.println("source(c):"+source+"-now:"+now);
            L.add(now);
        }
    }
}