import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        
    private static Scanner sc;

    private void solve() {
        int N = sc.nextInt();
        long M = 0, A = 0, R = 0, C = 0, H = 0;
        for (int i = 0; i < N; i++) {
            switch(sc.next().charAt(0)){
                case 'M': M++; break;
                case 'A': A++; break;
                case 'R': R++; break;
                case 'C': C++; break;
                case 'H': H++; break;
            }
        }
        System.out.println(
                M*A*R + M*A*C + M*A*H + M*R*C + M*R*H + M*C*H +
                A*R*C + A*R*H + A*C*H +
                R*C*H        
        );
    }
}