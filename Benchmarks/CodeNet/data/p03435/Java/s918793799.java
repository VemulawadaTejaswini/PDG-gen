import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        
    private static Scanner sc;

    private void solve() {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int[] a = new int[3];
        int[] b = new int[3];
        int ret = 1;
        for (int i = 0; i <= 100; i++) {
            a[0] = i;
            for (int j = 0; j < 3; j++) {
                b[j] = c[0][j]-a[0];
            }
            for (int j = 0; j < 3; j++) {
                a[j] = c[j][1] - b[1];
            }
            ret = 1;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    ret *= a[j] + b[k] == c[j][k] ? 1 : 0;
                }
            }
            if (ret == 1){break;}
        }
        if (ret == 1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}