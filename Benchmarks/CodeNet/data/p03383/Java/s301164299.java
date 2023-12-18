import java.io.*;
import java.util.*;

public class Main {

    public static boolean match(int[] c1, int[] c2, int mask, int fix) {
        int[] count = new int[26];
        for (int i = 0; i < c1.length; i++) {
            if (((1 << i) & mask) != 0) {
                count[c1[i]]++;
            } else if (i != fix){
                count[c2[i]]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        for (int i = 0; i < c1.length; i++) {
            if (((1 << i) & mask) != 0) {
                count[c2[i]]++;
            } else if (i != fix){
                count[c1[i]]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        if (fix != -1) {
            return c1[fix] == c2[fix];
        }
        return true;
    }

    public static boolean bobo(int[][] c, int mask, int fix, int n) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                graph[i][j] = graph[j][i] = match(c[i], c[j], mask, fix) ? 1: 0;
            }
        }
        return canMatch(graph, 0, n, 0, n % 2 == 1 ? 1 : 0, c, mask, fix, new int[n]);
    }
    
    public static class CHR {
        int[] v1, v2;

        public CHR(int[] v1, int[] v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CHR chr = (CHR) o;
            return Arrays.equals(v1, chr.v1) &&
                    Arrays.equals(v2, chr.v2);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(v1);
            result = 31 * result + Arrays.hashCode(v2);
            return result;
        }
    }
    
    public static boolean canMatch(int[][] graph, int usedMask, int n, int at, int selfMatch, int[][] c, int mask, int fix, int[] match) {
        if (at == n) {
            for (int rowMask = 0; rowMask < 1 << n; rowMask++) {
                int countRowMask = 0;
                Set<Integer> forbid = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    if (forbid.contains(i) || match[i] == i) countRowMask = -1000;
                    if (((1 << i) & rowMask) != 0) {
                        countRowMask += 1;
                        forbid.add(match[i]);
                    }
                }

                if (countRowMask == n / 2) {
                    int[] rowVisitOrder = new int[n];
                    int iidx = 0;
                    for (int i = 0; i < n; i++) {
                        if (((1 << i) & rowMask) != 0) {
                            rowVisitOrder[iidx++] = i;
                            rowVisitOrder[n / 2 + iidx - 1] = match[i];
                        }
                        if (match[i] == i) {
                            rowVisitOrder[n - 1] = i;
                        }
                    }

                    Map<CHR, Integer> mapCnt = new HashMap<>();
                    for (int i = 0; i < c[0].length; i++) {
                        if (i == fix) continue;
                        boolean firstHalf = ((1 << i) & mask) != 0;
                        int[] v1 = new int[(n + 1) / 2];
                        int[] v2 = new int[(n + 1) / 2];
                        int iidx1 = 0;
                        int iidx2 = 0;
                        for (int jdonit = 0; jdonit < n; jdonit++) {
                            int j = rowVisitOrder[jdonit];
                            if (match[j] != j) {
                                if (((1 << j) & rowMask) != 0) {
                                    v1[iidx1++] = c[j][i];
                                } else {
                                    v2[iidx2++] = c[j][i];
                                }
                            } else {
                                v1[iidx1++] = c[j][i];
                                v2[iidx2++] = c[j][i];
                            }
                        }
                        CHR cc;
                        if (firstHalf) {
                            cc = new CHR(v1, v2);
                        }  else {
                            cc = new CHR(v2, v1);
                        }
                        if (!mapCnt.containsKey(cc)) {
                            mapCnt.put(cc, firstHalf ? 1 : -1);
                        } else {
                            mapCnt.put(cc, mapCnt.get(cc) + (firstHalf ? 1 : -1));
                        }
                        if (mapCnt.get(cc) == 0) {
                            mapCnt.remove(cc);
                        }
                    }
                    if (mapCnt.size() == 0) {
                        return true;
                    }
                }
            }
            return false;

        }
        for (int i = 0; i < n; i++) {
            if (((1 << i) & usedMask) == 0) {
                if (graph[at][i] != 0) {
                    if (at != i) {
                        int nextChoose = 0;
                        int nextMask = usedMask | (1 << at) | (1 << i);
                        while (((1 << nextChoose) & nextMask) != 0) nextChoose++;
                        match[at] = i; match[i] = at;
                        if (canMatch(graph, nextMask, n, nextChoose, selfMatch, c, mask, fix, match)) return true;
                        match[at] = match[i] = 0;
                    } else if (selfMatch == 1) {
                        int nextChoose = 0;
                        int nextMask = usedMask | (1 << at) | (1 << i);
                        while (((1 << nextChoose) & nextMask) != 0) nextChoose++;
                        match[at] = i; match[i] = at;
                        if (canMatch(graph, nextMask, n, nextChoose, 0, c, mask, fix, match)) return true;
                        match[at] = match[i] = 0;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                c[i][j] = s.charAt(j) - 'a';
            }
        }
        if (m % 2 == 0) {
            for (int i = 0; i < 1 << m; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (((1 << j) & i) != 0) count++;
                }
                if (count == m / 2) {
                    if (bobo(c, i, -1, n)) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");return;
        } else {
            for (int fix = 0; fix < m; fix++) {
                for (int i = 0; i < 1 << m; i++) {
                    int count = 0;
                    for (int j = 0; j < m; j++) {
                        if (((1 << j) & i) != 0 && j != fix) count++;
                    }
                    if (count == m / 2) {
                        if (bobo(c, i, fix, n)) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
            System.out.println("NO");return;
        }
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}