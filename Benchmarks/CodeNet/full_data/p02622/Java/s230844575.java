import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://atcoder.jp/contests/abc172/tasks/abc172_b

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String S, T;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        S = br.readLine();
        T = br.readLine();
        
        for(int i = 0; i < S.length(); i++){
            char s = S.charAt(i);
            char t = T.charAt(i);
           if(s != t){
                result++;
           }
        }
        System.out.println(result);
    }

}