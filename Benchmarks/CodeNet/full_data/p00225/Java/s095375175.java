import java.util.*;

class Main{

    boolean[] used;
    boolean[][] path;
    int[] soutai;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            used = new boolean[26];
            path = new boolean[26][26];
            soutai = new int[26];

            for(int i=0; i<n; i++){
                String s = sc.next();
                int first = s.charAt(0) - 'a';
                int last = s.charAt(s.length()-1) - 'a';
                soutai[first]++;
                soutai[last]--;
                used[first] = used[last] = true;
                path[first][last] = true;
            }

            System.out.println(check());
        }
    }

    String check(){
        int idx = 0;
        for(int i=0; i<soutai.length; i++){
            if(!used[i]) continue;
            if(soutai[i]!=0) return "NG";
            idx = i;
        }
        for(int k=0; k<26; k++)
            for(int i=0; i<26; i++)
                for(int j=0; j<26; j++)
                    path[i][j] = path[i][j] | (path[i][k] & path[k][j]);

        for(int i=0; i<26; i++){
            if(!used[i]) continue;
            if(!path[idx][i]) return "NG";
            if(!path[i][idx]) return "NG";
        }
        return "OK";
    }

    public static void main(String[] args){
        new Main().solve();
    }
}