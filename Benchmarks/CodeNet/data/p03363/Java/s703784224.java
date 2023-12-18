import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        int[] s = new int[N];
        s[0] = A[0];
        for(int i = 1; i < N; i++){
            s[i] = s[i-1] + A[i];
        }
        Arrays.sort(s);
        long count = 0;
        for(int i = 0; i < N; i++){
            if(s[i] == 0)
                count++;
        }

        loop: for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                if(s[i] == s[j])
                    count++;
                else
                    continue loop;
            }
        }

        System.out.println(count);
    }
}