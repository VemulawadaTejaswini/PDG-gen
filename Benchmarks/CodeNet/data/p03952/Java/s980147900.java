import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int x = Integer.parseInt(in1[1]);
        br.close();

        int[] ans = new int[2*N - 1];
        
        if(x == 1 || x == 2 * N - 1){
            System.out.println("No");
            return;
        }

        if(N == 2){
            System.out.println("Yes");
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            return;
        }

        boolean[] used = new boolean[2*N];

        ans[N-1] = x;
        used[x] = true;
        if(x == 2){
            ans[N] = 1; used[1] = true;
            ans[N-2] = 3; used[3] = true;
            ans[N+1] = 4; used[4] = true;
        }else{
            ans[N] = x+1; used[x+1] = true;
            ans[N-2] = x-1; used[x-1] = true;
            ans[N+1] = x-2; used[x-2] = true;
        }

        int cnt = 0;
        for(int i = 1; i <= 2 * N - 1; i++){
            if(used[i]) continue;
            while(ans[cnt] != 0) cnt++;
            ans[cnt] = i;
            cnt++;
            used[i] = true;
        }
        for(int i = 0; i < 2 * N - 1; i++){
            System.out.println(ans[i]);
        }
    }
}