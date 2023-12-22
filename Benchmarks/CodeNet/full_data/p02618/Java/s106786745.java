import java.util.*;

public class Main {

    static final int D = 365;
    static final int[] c = new int[27];
    static final int[][] s = new int[365][27];
    static final int[] ans = new int[365];
    static final int[] last = new int[27];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int fla = 0;
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
            fla += c[i];
        }
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        Map<Integer, TreeSet<Integer>> lastMap = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            lastMap.put(i, new TreeSet<>());
            lastMap.get(i).add(0);
            lastMap.get(i).add(D+1);
        }
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for (int i = 0; i < D; i++) {
            score -= fla;
            int max = score;
            int idx = 0;
            for (int j = 1; j <= 26; j++) {
                int tmp = score + s[i][j] +  c[j] *(i - last[j] + 1);
                if(max < tmp){
                    max = tmp;
                    idx = j;
                }
            }
            score = max;
            ans[i] = idx;
            last[idx] = i+1;
            lastMap.get(idx).add(i+1);
        }

        for (int i = 0; i < D; i++) {
            int prei = ans[i];
            int idx = prei;
            int max = s[i][prei] + c[prei] * (i - lastMap.get(prei).lower(i+1) +1) * (lastMap.get(prei).higher(i+1) - i -1);
            for (int j = 1; j <= 26; j++) {
                if(j == prei)continue;
                int tmp = s[i][j] + c[j] * (i - lastMap.get(j).lower(i+1) +1) * (lastMap.get(j).higher(i+1) - i -1);
                if(max < tmp){
                    idx = j;
                    max = tmp;
                }
            }
            if(prei != idx){
                ans[i] = idx;
                lastMap.get(prei).remove(i+1);
                lastMap.get(idx).add(i+1);
            }
        }


        for (int i = 0; i < D; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
