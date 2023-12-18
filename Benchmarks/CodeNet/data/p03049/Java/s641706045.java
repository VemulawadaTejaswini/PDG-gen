import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        String[] s = new String[N];
        for (int i=0;i<N;i++){
            s[i] = br.readLine();
        }
        int ans = 0;
        int cnt_A = 0;
        int cnt_B = 0;
        for (String ss:s){
            for (int i=1;i<ss.length();i++){
                if (String.valueOf(ss.charAt(i-1)).equals("A") && String.valueOf(ss.charAt(i)).equals("B")){
                    ans++;
                }
            }
            if (String.valueOf(ss.charAt(0)).equals("B") && String.valueOf(ss.charAt(ss.length()-1)).equals("A")){
                cnt_A++;
                cnt_B++;
            } else if (String.valueOf(ss.charAt(0)).equals("B")){
                cnt_B++;
            } else if (String.valueOf(ss.charAt(ss.length()-1)).equals("A")){
                cnt_A++;
            }
        }
        ans += Math.min(cnt_A,cnt_B);
        System.out.println(ans);
    }
}