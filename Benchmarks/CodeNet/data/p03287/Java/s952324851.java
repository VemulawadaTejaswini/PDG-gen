import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] A = new long[N+1];
        for(int i=1;i<=N;i++){
            A[i] = sc.nextLong();
        }
        HashMap<Long,LinkedList<Integer>> dic = new HashMap<>();

        long[] rem = new long[N+1];
        long[] end = new long[N+1];
        long[] sum = new long[N+1];
        for(int i=1;i<=N;i++){
            sum[i] = sum[i-1]+A[i];
            rem[i] = (rem[i-1]+A[i])%M;
            if(dic.containsKey(rem[i])){
                dic.get(rem[i]).addLast(i);
            }
            else{
                LinkedList<Integer> cur = new LinkedList<>();
                cur.add(i);
                dic.put(rem[i],cur);
            }
        }
        for(int i=1;i<=N;i++){
            if(sum[i]<M) continue;
            if(A[i]%M==0){
                end[i] = end[i-1]+1;
            }
            else {
                LinkedList<Integer> cur = dic.get(rem[i]);
                if(cur.size()>0&&cur.peek()<i){
                    end[i] = end[cur.poll()]+1;
                }
                else{
                    end[i] = rem[i]==0?1:0;
                }
            }
        }
        long ans = 0;
        for(int i=1;i<=N;i++) ans += end[i];
        System.out.println(ans);
    }
}