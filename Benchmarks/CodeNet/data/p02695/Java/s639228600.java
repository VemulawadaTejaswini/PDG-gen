import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for(int i=0;i<Q;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        int globalSum = 0;
        for(List<Integer> A:mkPerm(N, M)){
            int sum=0;
            for(int i=0;i<Q;i++){
                if(A.get(b[i]-1) - A.get(a[i]-1) == c[i]){
                    sum += d[i];
                }
            }
            globalSum = Math.max(globalSum, sum);
        }
        System.out.println(globalSum);
    }
    private static List<List<Integer>> mkPerm(int cnt, int M){
        if(cnt == 1){
            List<List<Integer>> ret = new ArrayList<>();
            for(int i=1;i<=M;i++){
                List<Integer> add = new ArrayList<>();
                add.add(i);
                ret.add(add);
            }
            return ret;
        }
        List<List<Integer>> res = mkPerm(cnt-1, M);
        List<List<Integer>> ret = new ArrayList<>();
        for(List<Integer> p:res){
            for(int i=p.get(p.size()-1);i<=M;i++){
                List<Integer> toAdd = new ArrayList<>(p);
                toAdd.add(i);
                ret.add(toAdd);
            }
        }
        return ret;
    }
}
