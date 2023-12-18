import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        FastScanner stdIn = new FastScanner(System.in);
        String s = stdIn.next();
        char[] sc = s.toCharArray();
        long[] ans = new long[sc.length];

        boolean preIsR = true;
        int preTargetIndex = 0;

        for(int i=0; i<sc.length; i++){
            if(sc[i] == 'L'){
                if(i%2==0){
                    ans[i]++;
                }else{
                    ans[i-1]++;
                }
                preIsR = true;
                preTargetIndex = i;
                break;
            }
        }

        for(int i=1; i<sc.length; i++){
            if(preIsR && (sc[i] == 'R')){
                if((preTargetIndex-i)%2 == 0){
                    ans[preTargetIndex]++;
                }else{
                    ans[preTargetIndex-1]++;
                }
            }else if(preIsR && (sc[i] == 'L')){
                ans[i]++;
                preIsR = false;
            }else if(!preIsR && (sc[i] == 'R')){
                for(int j=i; j<sc.length; j++){
                    if(sc[j] == 'L'){
                        preTargetIndex = j;
                        break;
                    }
                }

                if((preTargetIndex-i)%2 == 0){
                    ans[preTargetIndex]++;
                }else{
                    ans[preTargetIndex-1]++;
                }
                preIsR = true;
            }else{
                if((i-preTargetIndex)%2 == 0){
                    ans[preTargetIndex]++;
                }else{
                    ans[preTargetIndex-1]++;
                }
            }
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public long nextInt() {
        return Integer.parseInt(next());
    }

}
