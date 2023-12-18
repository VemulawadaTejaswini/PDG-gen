import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        

    private void solve() {
        int N = sc.nextInt();
        int A = sc.nextInt();
        int tmp = N%500;
        if (tmp<=A){
            System.out.println("Yes");
        } else {
            System.out.println("No");            
        }        
    }
}