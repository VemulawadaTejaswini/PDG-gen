import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] I = new long[N];
        long[] J = new long[N];

        HashMap<Long, Long> Jmap = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            I[i] = A[i]+i+1;
            J[i] = i+1-A[i];

            if(Jmap.containsKey(J[i])){
                Jmap.put(J[i], Jmap.get(J[i])+1);
            }else{
                Jmap.put(J[i], (long)1);
            }
        }

        long ans = 0;
        for(int i = 0 ; i < N ; i++){
            Jmap.put(J[i], Jmap.get(J[i])-1);
            if(Jmap.containsKey(I[i])){
                ans += Jmap.get(I[i]);
            }
        }

        System.out.println(ans);
    }
}

