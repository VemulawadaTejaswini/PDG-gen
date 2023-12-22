import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n!=0){
            String[] list = new String[n];
            for(int i=0; i<n; i++) list[i] = sc.next();

            int INF = Integer.MAX_VALUE/10;
            int[][] dist = new int[26][26];
            for(int i=0; i<26; i++) Arrays.fill(dist[i], INF);
            for(int i=0; i<n; i++){
                char first = list[i].charAt(0);
                char last = list[i].charAt(list[i].length()-1);
                //if(dist[first-'a'][last-'a']==INF) dist[first-'a'][last-'a'] = 0;
                dist[first-'a'][last-'a'] = 1;
            }

            boolean boo = true;
            for(int i=0; i<26; i++){
                int cnt = 0;
                for(int j=0; j<26; j++){
                    if(dist[i][j]==1) cnt++;
                    if(dist[j][i]==1) cnt++;
                }
                if(cnt%2==1) boo = false;
            }

            if(boo) System.out.println("OK");
            else System.out.println("NG");
            n = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}