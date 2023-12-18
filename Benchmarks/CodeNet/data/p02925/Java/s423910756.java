import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[N][N-1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1; j++){
                A[i][j] = sc.nextInt();
                if(j == 0)
                    map.put(i, A[i][j]-1);
            }
        }
        sc.close();

        int count = 0;
        int sum = 0;
        int[] t = new int[N];
        int[] match = new int[N];
        while(true){
            Arrays.fill(t, 0);
            int c = 0;
            for(Integer key: map.keySet()){
               int ene = map.get(key);
               if(t[key] == 0 && t[ene] == 0){
                    if(map.get(ene) != key){
                        continue;
                    } else {
                        c++;
                        t[key] = 1;
                        t[ene] = 1;
                        match[key]++;
                        match[ene]++;
                        if(match[key] < N-1)
                            map.put(key, A[key][match[key]]-1);
                        if(match[ene] < N-1)
                            map.put(ene, A[ene][match[ene]]-1);
                    }
               } else {
                continue;
               }
            }
            if(c == 0){
                count = -1;
                break;
            }
            count++;
            sum += c;
            if(sum == N*(N-1)/2)
                break;
        }
        System.out.println(count);
    }
}