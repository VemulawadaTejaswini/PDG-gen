import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long [] List = new long [N+1];
        Arrays.fill(List,0);
        Set<Integer> set = new HashSet<>();
        int min = 999999999;
        for(int i=0;i<K;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(L<min)min = L;
            for(int j=L;j<=R;j++) {
                if(j+1<=N)List[j+1] = 1;
                set.add(j);
            }
        }
        for(int i=min;i<N-min+1;i++){
            if(List[i]!=0){
                for(int j:set){
                    if(i+j<=N)List[i+j]=(List[i+j]+List[i])%998244353;
                    else break;
                }
            }
        }
        System.out.println(List[N]);
    }
}