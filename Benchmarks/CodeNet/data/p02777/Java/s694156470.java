import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        String[] st = new String[N];
        int[] S = new int[N];
        st[0] = br.readLine();
        S[0] = Integer.parseInt(st[0]);

        loop: for(int i=1; i<N; i++){
            st[i] = br.readLine();
            S[i] = Integer.parseInt(st[i]);
            for(int j=0; j<i; j++){
                if(S[i]==S[j]){
                    System.out.println("NO");
                    break loop;
                }
               
            }
            if(i==N-1){
                System.out.println("YES");
            }
            
        }
    }
}