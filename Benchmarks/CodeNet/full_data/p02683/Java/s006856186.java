import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        book[] bookArr = new book[n];
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            bookArr[i] = new book(st, m);
        }
        dfs(n,m,bookArr,0, x, new int[n], 0);
        if (ans==Integer.MAX_VALUE)
            ans=-1;
        System.out.println(ans);
    }

    public static void dfs(int n, int m, book[] books, int pos, int X, int[] curSkill, int cost){
        if (pos==n){
            boolean valid=true;
            for (int i=0; i<m; i++){
                if (curSkill[i]<X){
                    valid=false;
                    break;
                }
            }
            if (valid){
                ans = Math.min(ans,cost);
            }
            return;
        }

        dfs(n,m,books,pos+1,X,curSkill,cost);
        int[] curSkillNew = curSkill.clone();

        for (int i=0; i<m; i++){
            curSkillNew[i]+=books[pos].skill[i];
        }
        dfs(n,m,books,pos+1,X,curSkillNew,cost+books[pos].cost);

    }

    public static class book{
        int cost;
        int[] skill;
        book(StringTokenizer st, int m){
            cost = Integer.parseInt(st.nextToken());
            skill = new int[m];
            for (int i=0; i<m; i++)
                skill[i] = Integer.parseInt(st.nextToken());
        }
    }
}
